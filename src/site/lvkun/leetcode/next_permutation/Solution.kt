package site.lvkun.leetcode.next_permutation

/** TODO: REDO */
class Solution {
    fun nextPermutation(nums: IntArray): Unit {
        var i = nums.lastIndex - 1
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--
        }

        if (i >= 0) {
            var j = nums.lastIndex
            while (j >= 0 && nums[j] <= nums[i]) {
                j--
            }
            swap(nums, i, j)
        }
        reverse(nums, i + 1)
    }

    private fun swap(nums: IntArray, i: Int, j:Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }

    private fun reverse(nums: IntArray, i: Int) {
        var start = i
        var end = nums.lastIndex

        while (start <= end) {
            swap(nums, start, end)
            start++
            end--
        }
    }

}