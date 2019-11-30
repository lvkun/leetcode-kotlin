package site.lvkun.leetcode.largest_rectangle_in_histogram

import java.util.*

class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = Stack<Int>()
        stack.push(-1)

        var maxArea = 0
        for (i in heights.indices) {
            while (stack.peek() != -1 && heights[i] <= heights[stack.peek()]) {
                maxArea = maxOf(maxArea, heights[stack.pop()] * (i - stack.peek() - 1))
            }

            stack.push(i)
        }

        while (stack.peek() != -1) {
            maxArea = maxOf(maxArea, heights[stack.pop()] * (heights.size - stack.peek() - 1))
        }

        return maxArea
    }
}