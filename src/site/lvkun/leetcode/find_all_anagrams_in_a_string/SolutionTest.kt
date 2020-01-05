package site.lvkun.leetcode.find_all_anagrams_in_a_string

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testFindAnagrams() {
        val solution = Solution()
        Assert.assertEquals(listOf(0, 6), solution.findAnagrams("cbaebabacd", "abc"))
        Assert.assertEquals(listOf(0, 1, 2), solution.findAnagrams("abab", "ab"))
    }
}