package site.lvkun.leetcode.valid_anagram

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsAnagram() {
        val solution = Solution()
        Assert.assertTrue(solution.isAnagram("anagram", "nagaram"))
        Assert.assertFalse(solution.isAnagram("rat", "car"))
    }
}