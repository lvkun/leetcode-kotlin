package site.lvkun.leetcode.the_skyline_problem

import java.util.*

class Solution {
    fun getSkyline(buildings: Array<IntArray>): List<List<Int>> {
        val lines = PriorityQueue<Pair<Int, Int>>() { o1, o2 ->
            return@PriorityQueue o1.first - o2.first
        }

        for (building in buildings) {
            lines.add(Pair(building[0], -building[2]))
            lines.add(Pair(building[1], building[2]))
        }

        val result = mutableListOf<MutableList<Int>>()
        var last = mutableListOf(0, 0)
        val pq = PriorityQueue<Int>() { i1, i2 ->
            i2 - i1
        }

        while (lines.isNotEmpty()) {
            val line = lines.poll()
            if (line.second < 0) {
                pq.add(-line.second)
            } else {
                pq.remove(line.second)
            }

            val maxHeight = pq.peek() ?: 0
            if (last[1] != maxHeight) {
                last = mutableListOf(line.first, maxHeight)
                result.add(last)
            }
        }

        return result
    }
}