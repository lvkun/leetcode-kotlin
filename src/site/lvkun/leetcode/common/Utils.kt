package site.lvkun.leetcode.common

class Utils {
    companion object {
        fun matrixFromString(str: String): Array<CharArray> {
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
    }
}