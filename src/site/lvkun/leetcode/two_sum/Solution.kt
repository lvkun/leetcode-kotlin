package site.lvkun.leetcode.two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val r = target - nums[i]

            if (map.containsKey(r)) {
                return intArrayOf(map[r]!!, i)
            }

            map[nums[i]] = i
        }

        return intArrayOf(-1, -1)
    }
}