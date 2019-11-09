package site.lvkun.leetcode.valid_anagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val map = IntArray(128)

        for (i in s.indices) {
            map[s[i].toInt()]++
            map[t[i].toInt()]--
        }

        return map.all { it == 0 }
    }
}