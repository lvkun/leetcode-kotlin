package site.lvkun.leetcode.sort_colors

class Solution {
    fun IntArray.swap(i1: Int, i2: Int) {
        val temp = get(i1)
        set(i1 ,get(i2))
        set(i2, temp)
    }

    fun sortColors(nums: IntArray): Unit {
        var low = 0
        var high = nums.lastIndex

        var cur = 0

        while (cur <= high) {
            when (nums[cur]) {
                0 -> {
                    nums.swap(cur, low)
                    cur++
                    low++
                }
                2 -> {
                    nums.swap(cur, high)
                    high--
                }
                1 -> {
                    cur++
                }
            }
        }
    }
}