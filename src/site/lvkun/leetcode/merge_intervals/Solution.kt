package site.lvkun.leetcode.merge_intervals

class Solution {
    private fun isOverlap(interval: IntArray, prevInterval: IntArray) =
            interval[0] <= prevInterval[1]

    private fun merge(interval: IntArray, prevInterval: IntArray) =
            intArrayOf(prevInterval[0], maxOf(prevInterval[1], interval[1]))

    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }

        val result = mutableListOf<IntArray>()
        var prevInterval: IntArray? = null
        for (interval in intervals) {
            if (prevInterval != null && isOverlap(interval, prevInterval)) {
                prevInterval = merge(interval, prevInterval)
            } else {
                if (prevInterval != null) {
                    result.add(prevInterval)
                }
                prevInterval = interval
            }
        }
        if (prevInterval != null) {
            result.add(prevInterval)
        }

        return result.toTypedArray()
    }
}