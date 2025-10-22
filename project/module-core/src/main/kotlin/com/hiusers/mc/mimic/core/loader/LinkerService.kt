/*
package com.hiusers.mc.mimic.core.loader

import net.byteflux.libby.BukkitLibraryManager
import net.byteflux.libby.Library
import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import taboolib.platform.util.bukkitPlugin

*/
/**
 * @author iiabc
 * @since 2025/9/25 15:42
 *//*

object LinkerService {

    @Awake(LifeCycle.INIT)
    fun init() {
        val libraryManager = BukkitLibraryManager(bukkitPlugin)
        libraryManager.addMavenCentral()

        // 添加 Kotlin
        listOf("kotlin-stdlib", "kotlin-reflect").forEach { artifact ->
            val kotlinLib = Library.builder()
                .groupId("org.jetbrains.kotlin")
                .artifactId(artifact)
                .version("2.1.0")
                .build()
            libraryManager.loadLibrary(kotlinLib)
        }

        // 加载 Exposed 依赖
        listOf("exposed-core", "exposed-dao", "exposed-jdbc", "exposed-java-time").forEach { artifact ->
            val library = Library.builder()
                .groupId("org.jetbrains.exposed")
                .artifactId(artifact)
                .version("1.0.0-beta-4")
                .build()
            libraryManager.loadLibrary(library)
        }

        // 加载 HikariCP
        val hikari = Library.builder()
            .groupId("com.zaxxer")
            .artifactId("HikariCP")
            .version("4.0.3")
            .build()
        libraryManager.loadLibrary(hikari)

        // 加载缓存
        val caffeine = Library.builder()
            .groupId("com.github.ben-manes.caffeine")
            .artifactId("caffeine")
            .version("3.2.2")
            .build()
        libraryManager.loadLibrary(caffeine)

        // 加载数学运算解析
        val keval = Library.builder()
            .groupId("com.notkamui.libs")
            .artifactId("keval")
            .version("1.1.1")
            .build()
        libraryManager.loadLibrary(keval)
    }

}*/
