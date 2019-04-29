package site.lvkun.leetcode.valid_parentheses

import java.util.Stack

class Solution {
    val map = mapOf(
        ')' to '(',
        ']' to '[',
        '}' to '{')

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s) {
            if (map.containsKey(c)) {
                if (stack.isEmpty()) {
                    return false
                }

                val top = stack.pop()
                if (top != map[c]) {
                    return false
                }
            } else {
                stack.push(c)
            }
        }

        return stack.isEmpty()
    }
}