package site.lvkun.leetcode.letter_combinations_of_a_phone_number

class Solution {

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) {
            return emptyList()
        }

        val resultList = mutableListOf<String>()
        combine(digits.toCharArray(), 0, emptyList(), resultList)
        return resultList
    }

    private fun combine(digits: CharArray, index: Int, result: List<Char>, resultList: MutableList<String>) {
        if (index >= digits.size) {
            resultList.add(result.joinToString(""))
            return
        }

        val digit = digits[index]
        if (!map.containsKey(digit)) {
            resultList.add(result.joinToString(""))
            return
        }
        val chars = map[digit]
        if (chars != null) {
            for (c in chars) {
                val newResult = result.toMutableList()
                newResult.add(c)
                combine(digits, index + 1, newResult, resultList)
            }
        }

    }

    companion object {
        private val map = mapOf(
                '2' to "abc".toCharArray(),
                '3' to "def".toCharArray(),
                '4' to "ghi".toCharArray(),
                '5' to "jkl".toCharArray(),
                '6' to "mno".toCharArray(),
                '7' to "pqrs".toCharArray(),
                '8' to "tuv".toCharArray(),
                '9' to "wxyz".toCharArray(),
                '0' to " ".toCharArray()
        )
    }
}