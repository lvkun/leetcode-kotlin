package site.lvkun.leetcode.nim_game

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCanWinNim() {
        val solution = Solution()
        Assert.assertFalse(solution.canWinNim(4))
        Assert.assertFalse(solution.canWinNim(1348820612))
    }
}