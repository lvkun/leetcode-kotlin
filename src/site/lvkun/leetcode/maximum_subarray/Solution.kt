package site.lvkun.leetcode.maximum_subarray

import kotlin.math.max

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = 0
        var maxSum = Int.MIN_VALUE

        for (n in nums) {
            sum += n
            maxSum = max(sum, maxSum)
            if (sum < 0) {
                sum = 0
            }
        }

        return maxSum
    }
}