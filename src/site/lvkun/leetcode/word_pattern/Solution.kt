package site.lvkun.leetcode.word_pattern

class Solution {
    fun wordPattern(pattern: String, str: String): Boolean {
        val patternCharArray = pattern.toCharArray()
        val strList = str.split(" ")

        if (patternCharArray.size != strList.size) {
            return false
        }

        val mapPatterToString = mutableMapOf<Char, String>()
        val mapStringToPattern = mutableMapOf<String, Char>()
        for (i in patternCharArray.indices) {
            val p = patternCharArray[i]
            val string = strList[i]
            if (!mapPatterToString.containsKey(p)) {
                if (mapStringToPattern.containsKey(string)) {
                    return false
                }

                mapPatterToString[p] = string
                mapStringToPattern[string] = p
            } else {
                if (mapPatterToString[p] != string || mapStringToPattern[string] != p) {
                    return false
                }
            }
        }

        return true
    }
}