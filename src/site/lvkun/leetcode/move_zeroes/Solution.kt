package site.lvkun.leetcode.move_zeroes

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var numberOfZero = 0
        for (i in nums.indices) {
            if (nums[i] == 0) {
                numberOfZero++
            } else {
                if (numberOfZero > 0) {
                    nums[i - numberOfZero] = nums[i]
                }
            }
        }

        if (numberOfZero > 0) {
            for (i in nums.size - numberOfZero .. nums.lastIndex) {
                nums[i] = 0
            }
        }
    }
}