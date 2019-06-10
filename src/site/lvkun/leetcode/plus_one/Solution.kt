package site.lvkun.leetcode.plus_one

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var plus = 1
        for (i in digits.size - 1 downTo 0) {
            val v = digits[i]
            if (v + plus > 9) {
                plus = 1
                digits[i] = 0
            } else {
                digits[i] = v + plus
                plus = 0
                break
            }
        }

        if (plus != 0) {
            return intArrayOf(plus).plus(digits)
        }

        return digits
    }
}