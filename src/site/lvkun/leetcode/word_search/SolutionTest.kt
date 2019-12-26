package site.lvkun.leetcode.word_search

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.Utils

class SolutionTest {
    @Test
    fun testExist() {
        val solution = Solution()
        val board = Utils.charMatrixFromString("[\n" +
                "  ['A','B','C','E'],\n" +
                "  ['S','F','C','S'],\n" +
                "  ['A','D','E','E']\n" +
                "]")
        Assert.assertTrue(solution.exist(board, "ABCCED"))
        Assert.assertTrue(solution.exist(board, "SEE"))
        Assert.assertFalse(solution.exist(board, "ABCB"))
    }
}