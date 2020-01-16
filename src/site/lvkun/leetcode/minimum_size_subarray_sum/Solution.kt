package site.lvkun.leetcode.minimum_size_subarray_sum

class Solution {
    fun minSubArrayLen(s: Int, nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        var start = 0
        var end = 0
        var sum = nums[0]
        var maxLen = Int.MAX_VALUE

        while (end < nums.size) {
            when {
                sum < s -> {
                    end++
                    if (end < nums.size) {
                        sum += nums[end]
                    }
                }
                sum >= s -> {
                    maxLen = minOf(end - start + 1, maxLen)

                    sum -= nums[start]
                    start++
                    if (start > end) {
                        end++
                    }
                }
            }
        }


        return if (maxLen == Int.MAX_VALUE) 0 else maxLen
    }
}