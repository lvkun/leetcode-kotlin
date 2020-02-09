package site.lvkun.leetcode.permutation_in_string

class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) {
            return false
        }

        val target = Count(s1, s1.indices)

        var start = 0
        var end = s1.lastIndex

        val count = Count(s2, IntRange(start, end))

        if (count.equals(target)) {
            return true
        }

        while (end + 1 < s2.length) {
            count.remove(s2[start++])
            count.add(s2[++end])

            if (count.equals(target)) {
                return true
            }
        }

        return false
    }

    private class Count(val s: String, val range: IntRange) {
        private val array = IntArray(26)

        private fun Char.toIndex(): Int {
            return this - 'a'
        }

        init {
            for (i in range) {
                array[s[i].toIndex()] += 1
            }
        }

        fun add(c: Char) {
            array[c.toIndex()] += 1
        }

        fun remove(c: Char) {
            array[c.toIndex()] -= 1
        }

        override fun equals(other: Any?): Boolean {
            if (other == null || other !is Count) {
                return false
            }

            return array.contentEquals(other.array)
        }
    }
}