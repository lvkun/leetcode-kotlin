package site.lvkun.leetcode.find_the_duplicate_number

/** TODO: REDO */
class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var slow = 0
        var fast = 0

        slow = nums[slow]
        fast = nums[nums[fast]]

        while (slow != fast) {
            slow = nums[slow]
            fast = nums[nums[fast]]
        }

        var p1 = 0
        var p2 = slow

        while (p1 != p2) {
            p1 = nums[p1]
            p2 = nums[p2]
        }

        return p1
    }
}