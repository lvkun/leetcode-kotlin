package site.lvkun.leetcode.add_digits

class Solution {
    fun addDigits(num: Int): Int {
        if (num < 10) {
            return num
        }
        val result = num % 9
        return if (result == 0) 9 else result
    }
}