package site.lvkun.leetcode.counting_bits

class Solution {
    fun countBits(num: Int): IntArray {
        val result = IntArray(num + 1)

        var mul = 1
        for (i in 1..num) {
            if (i < mul * 2) {
                result[i] = 1 + result[i - mul]
            } else {
                mul *= 2
                result[i] = 1
            }
        }

        return result
    }
}