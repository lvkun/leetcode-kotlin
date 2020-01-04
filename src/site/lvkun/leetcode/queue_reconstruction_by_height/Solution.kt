package site.lvkun.leetcode.queue_reconstruction_by_height

import java.util.*

class Solution {
    fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
        Arrays.sort(people) { p1, p2 ->
            if (p1[0] == p2[0]) {
                p1[1] - p2[1]
            } else {
                p2[0] - p1[0]
            }
        }

        val result = mutableListOf<IntArray>()
        for (p in people) {
            result.add(p[1], p)
        }

        return result.toTypedArray()
    }
}