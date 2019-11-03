package site.lvkun.leetcode.majority_element

class Solution {
    fun majorityElement(nums: IntArray): Int {
        var count = 1
        var result : Int? = null

        for (n in nums) {
            if (result != n) {
                count -= 1
                if (count == 0) {
                    result = n
                    count = 1
                }
            } else {
                count++
            }
        }

        return result!!
    }
}