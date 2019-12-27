package site.lvkun.leetcode.unique_binary_search_trees

class Solution {
    fun numTrees(n: Int): Int {
        val G = IntArray(n + 1)

        G[0] = 1
        G[1] = 1

        for (i in 2..n) {
            for (j in 1..i) {
                G[i] += G[j - 1] * G[i - j]
            }
        }

        return G[n]
    }
}