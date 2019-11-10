package site.lvkun.leetcode.word_pattern

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testWordPattern() {
        val solution = Solution()
        Assert.assertTrue(solution.wordPattern("abba", "dog cat cat dog"))
        Assert.assertFalse(solution.wordPattern("abba", "dog cat cat fish"))
        Assert.assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"))
        Assert.assertFalse(solution.wordPattern("abba", "dog dog dog dog"))
    }
}