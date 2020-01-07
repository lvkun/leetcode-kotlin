package site.lvkun.leetcode.shortest_unsorted_continuous_subarray

import java.util.*

/** TODO: REDO */
class Solution {
    fun findUnsortedSubarray(nums: IntArray): Int {
        val stack = Stack<Int>()
        var left = nums.size
        var right = 0

        for (i in nums.indices) {
            while (stack.isNotEmpty() && nums[stack.peek()] > nums[i]) {
                left = minOf(left, stack.pop())
            }
            stack.push(i)
        }

        stack.clear()
        for (i in nums.lastIndex downTo 0) {
            while (stack.isNotEmpty() && nums[stack.peek()] < nums[i]) {
                right = maxOf(right, stack.pop())
            }
            stack.push(i)
        }

        return if (right - left > 0) {
            right - left + 1
        } else {
            0
        }
    }
}