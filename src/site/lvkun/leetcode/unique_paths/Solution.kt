package site.lvkun.leetcode.unique_paths

import java.math.BigInteger

class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        return combination(m + n - 2, m - 1).toInt()
    }

    fun combination(n: Int, k: Int): BigInteger {
        return factorial(n) / (factorial(n - k) * factorial(k))
    }

    fun factorial(n: Int): BigInteger {
        var result = BigInteger.valueOf(1)

        if (n == 1) {
            return result
        }

        for (i in 1..n) {
            result *= BigInteger.valueOf(i.toLong())
        }

        return result
    }
}