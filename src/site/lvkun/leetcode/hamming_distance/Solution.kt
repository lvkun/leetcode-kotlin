package site.lvkun.leetcode.hamming_distance

class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        var r = x.xor(y)

        return Integer.bitCount(r)
    }
}