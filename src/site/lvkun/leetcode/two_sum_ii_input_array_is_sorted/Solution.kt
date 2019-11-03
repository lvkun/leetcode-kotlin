package site.lvkun.leetcode.two_sum_ii_input_array_is_sorted

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var start = 0
        var end = numbers.lastIndex

        while (start < end) {
            when {
                numbers[start] + numbers[end] < target -> start++
                numbers[start] + numbers[end] > target -> end--
                else -> return intArrayOf(start + 1, end + 1)
            }
        }

        return intArrayOf(0)
    }
}