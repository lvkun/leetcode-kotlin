package site.lvkun.leetcode.group_anagrams

import java.util.*

class Solution {
    fun String.key(): String {
        val count = IntArray(26)
        for (c in toCharArray()) {
            count[c - 'a'] += 1
        }
        return count.joinToString(",")
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val value = 0
        val map = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val key = str.key()
            if (map.containsKey(key)) {
                map[key]?.add(str)
            } else {
                map[key] = mutableListOf(str)
            }
        }

        return map.values.toList()
    }
}