package site.lvkun.leetcode.task_scheduler

/** TODO: REDO */
class Solution {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        val map = IntArray(26)
        for (c in tasks) {
            map[c -  'A']++
        }
        map.sort()

        val maxVal = map[25] - 1
        var idleSlots = maxVal * n

        for (i in 24 downTo 0) {
            if (map[i] <= 0) {
                break
            }

            idleSlots -= minOf(map[i], maxVal)
        }

        return if (idleSlots > 0) {
            idleSlots + tasks.size
        } else {
            tasks.size
        }
    }
}