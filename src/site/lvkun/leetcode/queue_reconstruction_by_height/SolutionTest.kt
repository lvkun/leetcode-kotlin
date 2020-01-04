package site.lvkun.leetcode.queue_reconstruction_by_height

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    fun parse(data: String): Array<IntArray> =
        data.replace("[", "")
                .replace("]", "")
                .split(",").windowed(2, 2, true).map { d ->
                    intArrayOf(d[0].trim().toInt(), d[1].trim().toInt())
                }.toTypedArray()

    @Test
    fun testReconstructQueue() {
        val solution = Solution()
        val people = parse("[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]")
        val result = solution.reconstructQueue(people)
        val expected = parse("[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]")
        Assert.assertArrayEquals(expected, result)
    }
}