package site.lvkun.leetcode.daily_temperatures

import java.util.*

/** TODO: REDO */
class Solution {
    fun dailyTemperatures(T: IntArray): IntArray {
        val result = IntArray(T.size)
        val stack = Stack<Int>()

        for (i in T.lastIndex downTo 0) {
            while (stack.isNotEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop()
            }

            result[i] = if (stack.isEmpty()) {
                0
            } else {
                stack.peek() - i
            }

            stack.push(i)
        }

        return result
    }
}