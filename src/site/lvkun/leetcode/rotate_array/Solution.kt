package site.lvkun.leetcode.rotate_array

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val remainder = k % nums.size
        if (remainder == 0) {
            return
        }

        var index = 0
        var count = nums.size

        var temp = nums[index]
        var next = index
        while (count > 0) {
            next = (next + remainder) % nums.size
            if (next == index) {
                count--
                nums[index] = temp
                index++
                next++
                temp = nums[index]
            } else {
                val nextValue = nums[next]
                count--
                nums[next] = temp
                temp = nextValue
            }
        }
    }
}