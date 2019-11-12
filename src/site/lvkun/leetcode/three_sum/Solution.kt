package site.lvkun.leetcode.three_sum

/** TODO: redo */
class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) {
            return emptyList()
        }

        nums.sort()

        var left = 0
        var center = left + 1
        var right = nums.lastIndex

        val result = mutableListOf<List<Int>>()

        for (left in 0 .. nums.size - 2) {
            if (nums[left] > 0) {
                return result
            }

            if (left > 0 && nums[left] == nums[left - 1]) {
                continue
            }

            center = left + 1
            right = nums.lastIndex

            while (center < right) {
                val sum = nums[left] + nums[center] + nums[right]
                when {
                    sum > 0 ->
                        right--
                    sum < 0 ->
                        center++
                    else -> {
                        result.add(listOf(nums[left], nums[center], nums[right]))
                        while (center < right && nums[center] == nums[center + 1]) {
                            center++
                        }
                        while (center < right && nums[right] == nums[right - 1]) {
                            right--
                        }
                        center++
                        right--
                    }
                }
            }
        }

        return result
    }
}