package site.lvkun.leetcode.find_all_numbers_disappeared_in_an_array

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {

        for (i in nums.indices) {
            while (nums[i] != i + 1 && nums[i] != -1) {
                if (nums[i] == nums[nums[i] - 1]) {
                    nums[i] = -1
                    break
                }

                swap(nums, i, nums[i] - 1)
            }
        }

        val result = mutableListOf<Int>()

        for (i in nums.indices) {
            if (nums[i] == -1) {
                result.add(i + 1)
            }
        }

        return result
    }

    fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}