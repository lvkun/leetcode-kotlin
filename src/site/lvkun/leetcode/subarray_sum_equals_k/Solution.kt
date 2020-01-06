package site.lvkun.leetcode.subarray_sum_equals_k

/** TODO: REDO */
class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0

        val map = mutableMapOf<Int, Int>()
        map[0] = 1

        var sum = 0
        for (i in nums) {
            sum += i
            if (map.containsKey(sum - k)) {
                count += map[sum - k]!!
            }
            map[sum] = 1 + map.getOrDefault(sum, 0)
        }

        return count
    }
}