package site.lvkun.leetcode.isomorphic_strings

class Solution {
    private fun Char.index() = this.toInt()

    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val mapS = IntArray(128) {-1}
        val mapT = IntArray(128) {-1}
        for (i in s.indices) {
            val sChar = s[i]
            val tChar = t[i]

            if (mapS[sChar.index()] == -1) {
                mapS[sChar.index()] = i
            }
            val indexS = mapS[sChar.index()]

            if (mapT[tChar.index()] == -1) {
                mapT[tChar.index()] = i
            }

            val indexT = mapT[tChar.index()]

            if (indexS != indexT) {
                return false
            }
        }

        return true
    }
}
