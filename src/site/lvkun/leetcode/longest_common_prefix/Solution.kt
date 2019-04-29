package site.lvkun.leetcode.longest_common_prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }

        var index = 0

        while (index < strs[0].length) {
            val c = strs[0][index]
            for (s in strs) {
                if (index == s.length || s[index] != c) {
                    return s.substring(0, index)
                }
            }

            index++
        }

        return strs[0]
    }
}