package site.lvkun.leetcode.combination_sum

import java.util.*

class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        return combinationSumInternal(candidates, 0, target)
    }

    fun combinationSumInternal(candidates: IntArray, index: Int, target: Int): LinkedList<LinkedList<Int>> {
        val resultList = LinkedList<LinkedList<Int>>()

        for (i in index until candidates.size) {
            val candidate = candidates[i]
            val nextTarget = target - candidate

            when {
                nextTarget == 0 -> {
                    val result = LinkedList<Int>()
                    result.add(candidate)
                    resultList.add(result)
                }
                nextTarget > 0 -> {
                    val partialResult = combinationSumInternal(candidates, i, nextTarget)

                    for (result in partialResult) {
                        result.addFirst(candidate)
                        resultList.add(result)
                    }
                }
            }
        }

        return resultList
    }
}