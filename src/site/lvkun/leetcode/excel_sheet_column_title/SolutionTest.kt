package site.lvkun.leetcode.excel_sheet_column_title

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testConvertToTitle() {
        val solution = Solution()
        Assert.assertEquals("A", solution.convertToTitle(1))
        Assert.assertEquals("AB", solution.convertToTitle(28))
        Assert.assertEquals("AZ", solution.convertToTitle(52))
        Assert.assertEquals("ZY", solution.convertToTitle(701))
    }
}