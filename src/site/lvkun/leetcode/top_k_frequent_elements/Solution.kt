package site.lvkun.leetcode.top_k_frequent_elements

import java.util.*

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): List<Int> {
        val map = mutableMapOf<Int, Int>()

        for (n in nums) {
            map[n] = map.getOrDefault(n, 0) + 1
        }

        val queue = PriorityQueue<Int>() {
            i1, i2 -> map[i1]!! - map[i2]!!
        }

        for (n in map.keys) {
            queue.offer(n)
            if (queue.size > k) {
                queue.poll()
            }
        }

        val result = mutableListOf<Int>()

        while (queue.isNotEmpty()) {
            result.add(queue.poll())
        }

        return result.reversed()
    }
}