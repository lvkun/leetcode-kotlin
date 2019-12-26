package site.lvkun.leetcode.jump_game

class Solution {
    fun canJump(nums: IntArray): Boolean {
        val result = BooleanArray(nums.size)
        result[nums.lastIndex] = true

        for (i in nums.lastIndex - 1 downTo 0) {
            val n = nums[i]
            if (n > 0) {
                for (j in 1..n) {
                    if (result[i + j]) {
                        result[i] = true
                        break
                    }
                }
            }
        }

        return result[0]
    }
}