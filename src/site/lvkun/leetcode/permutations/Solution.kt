package site.lvkun.leetcode.permutations

import java.util.*

class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        return permuteInternal(nums.toMutableSet())
    }

    fun permuteInternal(set: MutableSet<Int>): LinkedList<LinkedList<Int>> {
        val resultList = LinkedList<LinkedList<Int>>()

        if (set.size == 1) {
            resultList.add(LinkedList(set))
            return resultList
        }

        for (i in set.toList()) {
            set.remove(i)

            val partialResultList = permuteInternal(set)

            for (result in partialResultList) {
                result.addFirst(i)
                resultList.add(result)
            }

            set.add(i)
        }

        return resultList
    }
}