package site.lvkun.leetcode.maximum_product_subarray

class Solution {
    fun maxProduct(nums: IntArray): Int {
        var iMax = 1
        var iMin = 1
        var rMax = Int.MIN_VALUE

        for (n in nums) {
            if (n < 0) {
                val temp = iMax
                iMax = iMin
                iMin = temp
            }

            iMax = maxOf(iMax * n, n)
            iMin = minOf(iMin * n, n)

            rMax = maxOf(iMax, rMax)
        }


        return rMax
    }
}