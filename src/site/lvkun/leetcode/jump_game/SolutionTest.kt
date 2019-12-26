package site.lvkun.leetcode.jump_game

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCanJump() {
        val solution = Solution()
        Assert.assertTrue(solution.canJump(intArrayOf(2,3,1,1,4)))
        Assert.assertFalse(solution.canJump(intArrayOf(3,2,1,0,4)))
    }
}