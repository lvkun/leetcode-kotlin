package site.lvkun.leetcode.longest_consecutive_sequence

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = mutableSetOf<Int>()
        for (i in nums) {
            set.add(i)
        }

        var number = 0
        var length = 0

        var maxLength = 0
        for (i in set) {
            if (!set.contains(i - 1)) {
                number = i
                length = 1

                while (set.contains(number + 1)) {
                    number++
                    length++
                }

                maxLength = maxOf(maxLength, length)
            }
        }

        return maxLength
    }
}