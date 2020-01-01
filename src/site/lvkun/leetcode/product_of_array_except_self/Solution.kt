package site.lvkun.leetcode.product_of_array_except_self

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size) { 1 }

        var cur = 1
        for (i in 1..nums.lastIndex) {
            cur *= nums[i - 1]
            result[i] *= cur
        }

        cur = 1
        for (i in nums.lastIndex - 1 downTo 0) {
            cur *= nums[i + 1]
            result[i] *= cur
        }

        return result
    }
}