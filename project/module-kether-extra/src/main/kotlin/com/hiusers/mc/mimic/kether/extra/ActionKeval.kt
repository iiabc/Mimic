package com.hiusers.mc.mimic.kether.extra

import com.notkamui.keval.Keval
import taboolib.module.kether.KetherParser
import taboolib.module.kether.combinationParser

/**
 * 数学运算解析
 *
 * @author iiabc
 * @since 2025/9/25 15:58
 */
object ActionKeval {

    @KetherParser(["keval", "math-keval"], namespace = "quest_engine", shared = true)
    fun parser() = combinationParser {
        it.group(
            text(),
        ).apply(it) { text ->
            now {
                Keval.eval(text)
            }
        }
    }

}