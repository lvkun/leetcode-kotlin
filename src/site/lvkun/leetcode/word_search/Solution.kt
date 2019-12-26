package site.lvkun.leetcode.word_search

class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val m = board.size
        val n = board[0].size

        for (row in 0 until m) {
            for (col in 0 until n) {
                if (exist(board, word, row, col, 0)) {
                    return true
                }
            }
        }

        return false
    }

    fun exist(board: Array<CharArray>, word: String, row: Int, col: Int, wordIndex: Int): Boolean {
        val m = board.size
        val n = board[0].size

        if (row < 0 || col < 0 || row >= m || col >= n) {
            return false
        }

        if (board[row][col] != word[wordIndex]) {
            return false
        }

        if (wordIndex == word.length - 1) {
            return true
        }

        val oldChar = board[row][col]
        board[row][col] = '*'

        if (exist(board, word, row - 1, col, wordIndex + 1) ||
                exist(board, word, row + 1, col, wordIndex + 1) ||
                exist(board, word, row, col - 1, wordIndex + 1) ||
                exist(board, word, row, col + 1, wordIndex + 1)) {
            board[row][col] = oldChar
            return true
        }

        board[row][col] = oldChar
        return false
    }
}