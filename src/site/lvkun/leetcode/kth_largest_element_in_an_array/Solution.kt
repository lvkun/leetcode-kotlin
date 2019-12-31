package site.lvkun.leetcode.kth_largest_element_in_an_array

import java.util.*

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        return findKthLargestQS(nums, k)
    }

    /**
     * Find kth largest with PriorityQueue
     */
    fun findKthLargestPQ(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>()

        for (n in nums) {
            if (pq.isEmpty() || pq.peek() < n) {
                pq.offer(n)
            }

            if (pq.size > k) {
                pq.poll()
            }
        }
        return pq.peek()
    }

    fun IntRange.size(): Int = last - start + 1

    /**
     * Find kth largest with quick select
     */
    fun findKthLargestQS(nums: IntArray, k: Int): Int {
        var range = nums.indices
        var i = -1
        while (i != k - 1) {
            i = partition(nums, range)
            when {
                i < k - 1 -> {
                    range = IntRange(i + 1, range.last)
                }
                i > k - 1 -> {
                    range = IntRange(range.first, i - 1)
                }
            }
        }

        return nums[i]
    }

    fun partition(nums: IntArray, range: IntRange): Int {
        val n = nums[range.first]

        var left = range.first + 1
        var right = range.last

        var nLeft = range.first
        var nRight = range.first

        while (left <= right) {
            when {
                nums[left] > n -> {
                    swap(nums, nLeft, left)
                    left++
                    nLeft++
                    nRight++
                }
                nums[left] < n -> {
                    swap(nums, left, right)
                    right--
                }
                else -> {
                    nRight++
                    left++
                }
            }
        }

        return nLeft
    }

    fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}