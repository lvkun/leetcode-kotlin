package site.lvkun.leetcode.isomorphic_strings

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testIsIsomorphic() {
        val solution = Solution()
        Assert.assertTrue(solution.isIsomorphic("egg", "add"))
        Assert.assertFalse(solution.isIsomorphic("foo", "bar"))
        Assert.assertTrue(solution.isIsomorphic("paper", "title"))
    }
}