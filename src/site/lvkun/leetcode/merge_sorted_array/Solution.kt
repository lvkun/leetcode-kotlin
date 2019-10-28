package site.lvkun.leetcode.merge_sorted_array

import java.util.*

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1
        var j = n - 1

        var p = m + n - 1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[p] = nums1[i]
                i--
            } else {
                nums1[p] = nums2[j]
                j--
            }
            p--
        }

        if (j >= 0) {
            System.arraycopy(nums2, 0, nums1, 0, j + 1)
        }
    }
}