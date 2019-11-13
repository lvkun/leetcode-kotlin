package site.lvkun.leetcode.letter_combinations_of_a_phone_number

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLetterCombinations() {
        val solution = Solution()
        val result = solution.letterCombinations("23")
        val expected = listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
        Assert.assertEquals(expected, result)
    }
}