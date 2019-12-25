package site.lvkun.leetcode.rotate_image

import org.junit.Assert
import org.junit.Test
import site.lvkun.leetcode.common.Utils

class SolutionTest {
    @Test
    fun testRotate() {
        val solution = Solution()
        var result = Utils.intMatrixFromString("[\n" +
                "  [1,2,3],\n" +
                "  [4,5,6],\n" +
                "  [7,8,9]\n" +
                "]")
//        solution.rotate(result)
        var expected = Utils.intMatrixFromString("[\n" +
                "  [7,4,1],\n" +
                "  [8,5,2],\n" +
                "  [9,6,3]\n" +
                "]")
//        Assert.assertArrayEquals(expected, result)

        result = Utils.intMatrixFromString("[\n" +
                "  [ 5, 1, 9,11],\n" +
                "  [ 2, 4, 8,10],\n" +
                "  [13, 3, 6, 7],\n" +
                "  [15,14,12,16]\n" +
                "]")
        expected = Utils.intMatrixFromString("[\n" +
                "  [15,13, 2, 5],\n" +
                "  [14, 3, 4, 1],\n" +
                "  [12, 6, 8, 9],\n" +
                "  [16, 7,10,11]\n" +
                "]")
        solution.rotate(result)
        Assert.assertArrayEquals(expected, result)
    }
}