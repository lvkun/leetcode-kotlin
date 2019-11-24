package site.lvkun.leetcode.group_anagrams

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testGroupAnagrams() {
        val solution = Solution()

        val result = solution.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        val expected = listOf(listOf("ate","eat","tea"), listOf("nat","tan"), listOf("bat"))

        Assert.assertEquals(result.size, expected.size)
        for (i in result.indices) {
            val resultItem = result[i].toSet()
            val expectedItem = expected[i].toSet()
            Assert.assertEquals(expectedItem, resultItem)
        }
    }
}