package site.lvkun.leetcode.add_binary

class Solution {
    private fun String.binAt(index: Int): Int {
        if (index < 0 || index >= this.length) {
            return 0
        }
        return this[index] - '0'
    }

    fun addBinary(a: String, b: String): String {
        var carry = 0
        val result = mutableListOf<Char>()

        val maxLength = maxOf(a.length, b.length)

        for (i in 1..maxLength) {
            val aValue = a.binAt(a.length - i)
            val bValue = b.binAt(b.length - i)

            val sum = carry + aValue + bValue
            carry = sum / 2
            result.add('0' + sum % 2)
        }

        if (carry != 0) {
            result.add('1')
        }

        return result.reversed().joinToString("")
    }
}