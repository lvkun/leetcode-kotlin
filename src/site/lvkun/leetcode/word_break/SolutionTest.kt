package site.lvkun.leetcode.word_break

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testWordBreak() {
        val solution = Solution()
        Assert.assertTrue(solution.wordBreak("leetcode", listOf("leet", "code")))
        Assert.assertTrue(solution.wordBreak("applepenapple", listOf("apple", "pen")))
        Assert.assertFalse(solution.wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")))
    }
}