package site.lvkun.leetcode.find_all_anagrams_in_a_string

import java.util.*

class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        if (s.length < p.length) {
            return emptyList()
        }

        val cp = CharCounter()
        p.forEach {c ->
            cp.addChar(c)
        }

        var left = 0
        var right = 0
        val cs = CharCounter()
        while (right < p.length) {
            cs.addChar(s[right++])
        }

        val result = mutableListOf<Int>()
        if (cs == cp) {
            result.add(0)
        }

        while (right < s.length) {
            cs.removeChar(s[left++])
            cs.addChar(s[right++])

            if (cs == cp) {
                result.add(left)
            }
        }

        return result
    }

    class CharCounter {
        val data = IntArray(26)

        fun addChar(c: Char) {
            data[c - 'a']++
        }

        fun removeChar(c: Char) {
            data[c - 'a']--
        }

        override fun equals(other: Any?): Boolean {
            if (other !is CharCounter) {
                return false
            }

            return data.contentEquals(other.data)
        }
    }
}