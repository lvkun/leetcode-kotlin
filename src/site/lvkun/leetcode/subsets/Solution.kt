package site.lvkun.leetcode.subsets

import java.util.*

class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        return subsets(nums, 0)
    }

    fun subsets(nums: IntArray, i: Int): LinkedList<LinkedList<Int>> {
        val resultList = LinkedList<LinkedList<Int>>()
        if (i == nums.size) {
            resultList.add(LinkedList())
            return resultList
        }

        val partialResult = subsets(nums, i + 1)
        resultList.addAll(partialResult)

        for (result in partialResult) {
            val newResult = LinkedList(result)
            newResult.addFirst(nums[i])
            resultList.add(newResult)
        }

        return resultList
    }
}