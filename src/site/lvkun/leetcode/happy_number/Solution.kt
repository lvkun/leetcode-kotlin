package site.lvkun.leetcode.happy_number

class Solution {
    fun isHappy(n: Int): Boolean {

        val set = mutableSetOf<Int>()

        var number = n
        while (!set.contains(number)) {
            set.add(number)

            number = next(number)
            if (number == 1) {
                return true
            }
        }
        return false
    }

    private fun next(n: Int): Int {
        var result = 0
        var num = n
        while (num > 0) {
            val digit = num % 10
            result += digit * digit
            num /= 10
        }

        return result
    }
}