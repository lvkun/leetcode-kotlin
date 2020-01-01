package site.lvkun.leetcode.sliding_window_maximum

import java.util.*

class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        if (k == 0) {
            return nums
        }

        val maxQueue = ArrayDeque<Int>()

        val result = IntArray(nums.size - k + 1)
        for (i in nums.indices) {
            if (maxQueue.isNotEmpty() && maxQueue.peekFirst() < i - k + 1) {
                maxQueue.pollFirst()
            }

            while (maxQueue.isNotEmpty() && nums[maxQueue.peekLast()] < nums[i]) {
                maxQueue.removeLast()
            }

            maxQueue.offerLast(i)

            if (i >= k - 1) {
                result[i - k + 1] = nums[maxQueue.peekFirst()]
            }
        }

        return result
    }
}