package site.lvkun.leetcode.excel_sheet_column_number

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testTitleToNumber() {
        val solution = Solution()
        Assert.assertEquals(1, solution.titleToNumber("A"))
        Assert.assertEquals(28, solution.titleToNumber("AB"))
        Assert.assertEquals(701, solution.titleToNumber("ZY"))
    }
}