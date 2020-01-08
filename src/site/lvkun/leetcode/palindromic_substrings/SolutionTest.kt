package site.lvkun.leetcode.palindromic_substrings

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testCountSubstrings() {
        val solution = Solution()
        Assert.assertEquals(3, solution.countSubstrings("abc"))
        Assert.assertEquals(6, solution.countSubstrings("aaa"))
        Assert.assertEquals(15, solution.countSubstrings("aaaaa"))
    }
}