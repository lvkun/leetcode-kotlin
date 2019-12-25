package site.lvkun.leetcode.common

object Utils {
    fun charMatrixFromString(str: String): Array<CharArray> {
        val lines = str.replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .split("\n")

        val result = mutableListOf<CharArray>()
        for (line in lines) {
            if (line.trim().isNotEmpty()) {
                val lineResult = mutableListOf<Char>()
                for (s in line.split(",")) {
                    val c = s.trim()
                    if (c.isNotEmpty()) {
                        lineResult.add(c[0])
                    }
                }
                result.add(lineResult.toCharArray())
            }
        }

        return result.toTypedArray()
    }

    fun intMatrixFromString(str: String): Array<IntArray> {
        val lines = str.replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .split("\n")

        val result = mutableListOf<IntArray>()
        for (line in lines) {
            if (line.trim().isNotEmpty()) {
                val lineResult = mutableListOf<Int>()
                for (s in line.split(",")) {
                    val c = s.trim()
                    if (c.isNotEmpty()) {
                        lineResult.add(c.toInt())
                    }
                }
                result.add(lineResult.toIntArray())
            }
        }

        return result.toTypedArray()
    }
}