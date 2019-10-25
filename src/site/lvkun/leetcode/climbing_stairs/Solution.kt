package site.lvkun.leetcode.climbing_stairs

class Solution {
    fun climbStairs(n: Int): Int {
        var rn2 = 0
        var rn1 = 1
        for (i in 0 until n) {
            val r = rn1 + rn2
            rn2 = rn1
            rn1 = r
        }

        return rn1
    }
}