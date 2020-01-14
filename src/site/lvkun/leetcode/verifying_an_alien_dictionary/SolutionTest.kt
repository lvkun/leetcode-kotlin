package site.lvkun.leetcode.verifying_an_alien_dictionary

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsAlienSorted() {
        val solution = Solution()
        Assert.assertTrue(solution.isAlienSorted(arrayOf("hello","leetcode"), "hlabcdefgijkmnopqrstuvwxyz"))
        Assert.assertFalse(solution.isAlienSorted(arrayOf("word","world","row"), "worldabcefghijkmnpqstuvxyz"))
        Assert.assertFalse(solution.isAlienSorted(arrayOf("apple","app"), "abcdefghijklmnopqrstuvwxyz"))
    }
}