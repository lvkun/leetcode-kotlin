package site.lvkun.leetcode.container_with_most_water

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex

        var result = 0
        while (left < right) {

            val hLeft = height[left]
            val hRight = height[right]

            val area = minOf(hLeft, hRight) * (right - left)
            result = maxOf(result, area)

            if (hLeft <= hRight) {
                left++
            } else {
                right--
            }
        }

        return result
    }
}