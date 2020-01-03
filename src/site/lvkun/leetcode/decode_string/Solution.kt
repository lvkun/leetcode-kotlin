package site.lvkun.leetcode.decode_string

import java.util.*

class Solution {
    fun decodeString(s: String): String {
        var curNumber = mutableListOf<Char>()
        var curString = mutableListOf<Char>()

        val stack = Stack<List<Char>>()
        for (c in s) {
            when {
                c == '[' -> {
                    stack.push(curNumber)
                    curNumber = mutableListOf()
                }
                c == ']' -> {
                    val n = stack.pop().joinToString("").toInt()
                    val newString = mutableListOf<Char>()
                    if (stack.isNotEmpty() && stack.peek().first().isLetter()) {
                        newString.addAll(stack.pop())
                    }
                    repeat(n) {
                        newString.addAll(curString)
                    }
                    curString = newString
                }
                c.isDigit() -> {
                    if (curString.isNotEmpty()) {
                        stack.push(curString)
                        curString = mutableListOf()
                    }
                    curNumber.add(c)
                }
                c.isLetter() -> curString.add(c)
            }
        }

        return curString.joinToString("")
    }
}