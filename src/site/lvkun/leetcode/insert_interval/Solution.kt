package site.lvkun.leetcode.insert_interval

class Solution {
    private fun isOverlap(interval: IntArray, otherInterval: IntArray) =
            interval[0] <= otherInterval[0] && interval[1] >= otherInterval[0] ||
                    otherInterval[0] <= interval[0] && otherInterval[1] >= interval[0]

    private fun merge(interval: IntArray, otherInterval: IntArray) =
            intArrayOf(minOf(otherInterval[0], interval[0]), maxOf(otherInterval[1], interval[1]))

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        if (intervals.isEmpty()) {
            return arrayOf(newInterval)
        }

        val result = mutableListOf<IntArray>()

        var mergedInterval: IntArray = newInterval
        var hasAdded = false
        for (interval in intervals) {
            when {
                interval[1] < mergedInterval[0] -> result.add(interval)
                interval[0] > mergedInterval[1] -> {
                    if (!hasAdded) {
                        result.add(mergedInterval)
                        hasAdded = true
                    }
                    result.add(interval)
                }
                isOverlap(interval, mergedInterval) -> mergedInterval = merge(interval, mergedInterval)
                else -> result.add(interval)
            }
        }

        if (!hasAdded) {
            result.add(mergedInterval)
        }

        return result.toTypedArray()
    }
}