package site.lvkun.leetcode.count_and_say

class Solution {
    fun countAndSay(n: Int): String {
        if (n == 1) {
            return "1"
        }

        val lastResult = countAndSay(n - 1)
        var count = 1
        var lastChar = lastResult[0]
        var result = ""
        for (i in 1 until lastResult.length) {
            val curChar = lastResult[i]
            if (curChar != lastChar) {
                result += "" + count + lastChar

                lastChar = curChar
                count = 1
            } else {
                count++
            }
        }

        result += "" + count + lastChar

        return result
    }
}