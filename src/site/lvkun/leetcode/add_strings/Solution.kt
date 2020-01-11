package site.lvkun.leetcode.add_strings

class Solution {
    private fun String.at(i: Int): Int {
        if (i < 0 || i >= this.length) {
            return 0
        }

        return this[this.length - 1 - i] - '0'
    }

    fun addStrings(num1: String, num2: String): String {
        val maxLength = maxOf(num1.length, num2.length)

        var carry = 0
        val result = mutableListOf<Char>()
        for (i in 0 until maxLength) {
            val sum = num1.at(i) + num2.at(i) + carry
            carry = sum / 10
            result.add('0' + sum % 10)
        }

        if (carry != 0) {
            result.add('0' + carry)
        }

        return result.reversed().joinToString("")
    }
}