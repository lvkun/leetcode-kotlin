package site.lvkun.leetcode.minimum_window_substring

/** TODO: redo */
class Solution {
    fun minWindow(s: String, t: String): String {
        if (s.isEmpty() || t.isEmpty()) {
            return ""
        }

        val map = mutableMapOf<Char, Int>()
        for (c in t) {
            val count = map.getOrDefault(c, 0)
            map[c] = count + 1
        }

        val required = map.size
        var left = 0
        var right = 0

        var formed = 0

        val windowCount = mutableMapOf<Char, Int>()

        var result = Pair(0, Int.MAX_VALUE)
        while (right < s.length) {
            val cR = s[right]
            val count = windowCount.getOrDefault(cR, 0)
            windowCount[cR] = count + 1

            if (map.containsKey(cR) && map[cR] == windowCount[cR]) {
                formed++
            }

            while (left <= right && formed == required) {
                val cL = s[left]

                if (right - left + 1< result.second - result.first) {
                    result = Pair(left, right + 1)
                }

                windowCount[cL] = windowCount[cL]!! - 1

                if (map.containsKey(cL) && windowCount[cL]!! < map[cL]!!) {
                    formed--
                }

                left++

            }

            right++
        }

        return if (result.second == Int.MAX_VALUE) "" else s.substring(result.first, result.second)
    }
}