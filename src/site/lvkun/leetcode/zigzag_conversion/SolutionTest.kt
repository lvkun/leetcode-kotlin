package site.lvkun.leetcode.zigzag_conversion

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testConvert() {
        val solution = Solution()
        var result = solution.convert("PAYPALISHIRING", 3)
        Assert.assertEquals("PAHNAPLSIIGYIR", result)

        result = solution.convert("PAYPALISHIRING", 4)
        Assert.assertEquals("PINALSIGYAHRPI", result)

        result = solution.convert("A", 1)
    }
}