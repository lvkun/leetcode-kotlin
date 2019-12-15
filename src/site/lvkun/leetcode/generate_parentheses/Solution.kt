package site.lvkun.leetcode.generate_parentheses

class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()
        backtrack(result, "", 0, 0, n)
        return result
    }

    private fun backtrack(result: MutableList<String>, cur: String, open: Int, close: Int, max: Int) {
        if (cur.length == max * 2) {
            result.add(cur)
            return
        }

        if (open < max) {
            backtrack(result, "$cur(", open + 1, close, max)
        }

        if (close < open) {
            backtrack(result, "$cur)", open, close + 1, max)
        }
    }
}