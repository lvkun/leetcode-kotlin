package site.lvkun.leetcode.multiply_strings

class Solution {

    fun String.at(i: Int): Int {
        return this[this.length - i - 1] - '0'
    }

    fun IntArray.plus(index: Int, num: Int) {
        val newNum = num + this[index]
        this[index] = (newNum % 10)

        if (newNum >= 10) {
            this.plus(index + 1, newNum / 10)
        }
    }

    fun multiply(num1: String, num2: String): String {
        val n = num1.length
        val m = num2.length

        val result = IntArray(n + m)

        for (i in 0 until n) {
            for (j in 0 until m) {
                val k = i + j
                val sum = num1.at(i) * num2.at(j)

                result.plus(k, sum)
            }
        }

        result.reverse()
        val strResult = result.joinToString("")
        var startIndex = result.indexOfFirst { n ->
            n != 0
        }

        if (startIndex == -1) {
            startIndex = strResult.lastIndex
        }

        return strResult.substring(startIndex)
    }
}