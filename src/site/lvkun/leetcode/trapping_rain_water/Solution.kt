package site.lvkun.leetcode.trapping_rain_water

class Solution {
    fun trap(height: IntArray): Int {
        val maxHeightLeft = IntArray(height.size)
        val maxHeightRight = IntArray(height.size)

        var maxHeight = 0
        for (i in height.indices) {
            val h = height[i]
            maxHeight = maxOf(h, maxHeight)
            maxHeightLeft[i] = maxHeight
        }

        maxHeight = 0
        for (i in height.indices.reversed()) {
            val h = height[i]
            maxHeight = maxOf(h, maxHeight)
            maxHeightRight[i] = maxHeight
        }

        var result = 0
        for (i in height.indices) {
            val h = height[i]
            val hL = maxHeightLeft[i]
            val hR = maxHeightRight[i]

            result += minOf(hL, hR) - h
        }

        return result
    }
}