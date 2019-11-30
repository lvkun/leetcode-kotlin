package site.lvkun.leetcode.maximal_rectangle

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

    fun maximalRectangle(matrix: Array<CharArray>): Int {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return 0
        }

        val row = matrix.size
        val col = matrix[0].size

        val heights = IntArray(col)

        var maxArea = 0
        for (i in 0 until row) {
            for (j in 0 until col) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1
                } else {
                    heights[j] = 0
                }
            }

            maxArea = maxOf(maxArea, largestRectangleArea(heights))
        }

        return maxArea
    }
}