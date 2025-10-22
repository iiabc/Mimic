@file:Suppress("PropertyName", "SpellCheckingInspection")

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("com.github.johnrengelman.shadow")
}

dependencies {
    implementation(project(":plugin"))
}

tasks {
    val pluginShadow = project(":plugin").tasks.named("shadowJar", ShadowJar::class.java)

    shadowJar {
        dependsOn(pluginShadow)

        // 不直接打进任何坐标依赖，由下方 from 引入已产出的构件
        dependencies {
            exclude(dependency(".*:.*"))
        }

        // 引入 plugin 的 shadow 产物
        from(pluginShadow.get().archiveFile)

        // 如果存在 database 子模块，则一起聚合
        val dbProject = findProject(":project:module-database")
        if (dbProject != null) {
            val dbShadow = project(":project:module-database").tasks.named("shadowJar", ShadowJar::class.java)
            dependsOn(dbShadow)
            from(dbShadow.get().archiveFile) {
                exclude("META-INF")
            }
        }

        archiveBaseName.set(rootProject.name)
        archiveClassifier.set("bundle")
    }

    build {
        dependsOn(shadowJar)
    }
}


