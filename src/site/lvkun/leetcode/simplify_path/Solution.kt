package site.lvkun.leetcode.simplify_path

import java.util.*

class Solution {
    fun simplifyPath(path: String): String {
        val stack = Stack<String>()

        for (dir in path.split("/")) {
            when {
                dir.isEmpty() -> {
                }
                dir == "." -> {
                }
                dir == ".." -> {
                    if (stack.isNotEmpty()) {
                        stack.pop()
                    }
                }
                else -> {
                    stack.push(dir)
                }
            }
        }

        return "/" + stack.joinToString("/")
    }
}