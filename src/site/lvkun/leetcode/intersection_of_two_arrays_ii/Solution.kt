package site.lvkun.leetcode.intersection_of_two_arrays_ii

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        return if (nums1.size > nums2.size) {
            intersectInternal(nums1, nums2)
        } else {
            intersectInternal(nums2, nums1)
        }
    }

    private fun intersectInternal(larger: IntArray, smaller: IntArray): IntArray {
        val map = mutableMapOf<Int, Int>()
        smaller.forEach { i ->
            map[i] = map.getOrDefault(i, 0) + 1
        }

        val result = mutableListOf<Int>()
        for (i in larger) {
            if (map.getOrDefault(i, 0) > 0) {
                result.add(i)
                map[i] = map.getOrDefault(i, 0) - 1
            }
        }

        return result.toIntArray()
    }
}