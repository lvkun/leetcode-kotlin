package site.lvkun.leetcode.string_to_integer_atoi

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testMyAtoi() {
        val solution = Solution()
        var result = solution.myAtoi("")
        Assert.assertEquals(0, result)

        result = solution.myAtoi("42")
        Assert.assertEquals(42, result)

        result = solution.myAtoi("   -42")
        Assert.assertEquals(-42, result)

        result = solution.myAtoi("4193 with words")
        Assert.assertEquals(4193, result)

        result = solution.myAtoi("words and 987")
        Assert.assertEquals(0, result)

        result = solution.myAtoi("-91283472332")
        Assert.assertEquals(-2147483648, result)

        result = solution.myAtoi("+1")
        Assert.assertEquals(1, result)

        result = solution.myAtoi("+-2")
        Assert.assertEquals(0, result)

        result = solution.myAtoi("2147483648")
        Assert.assertEquals(2147483647, result)

        result = solution.myAtoi("2147483646")
        Assert.assertEquals(2147483646, result)

        result = solution.myAtoi("-2147483647")
        Assert.assertEquals(-2147483647, result)
    }
}