package site.lvkun.leetcode.verifying_an_alien_dictionary

class Solution {

    private fun Char.order(orderMap: IntArray): Int {
        val i = this - 'a'
        if (i in orderMap.indices) {
            return orderMap[i]
        }

        return -1
    }

    private fun String.at(i: Int): Char {
        if (i in this.indices) {
            return this[i]
        }
        return 'a' - 1
    }

    private fun String.greaterThan(other: String, orderMap: IntArray): Boolean {
        val maxLength = maxOf(this.length, other.length)

        for (i in 0 until maxLength) {
            if (this.at(i) == other.at(i)) {
                continue
            }

            return this.at(i).order(orderMap) > other.at(i).order(orderMap)
        }

        return false
    }

    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val orderMap = buildOrderMap(order)

        for ((before, after) in words.indices.zipWithNext()) {
            if (words[before].greaterThan(words[after], orderMap)) {
                return false
            }
        }

        return true
    }

    private fun buildOrderMap(order: String): IntArray {
        val orderMap = IntArray(order.length)
        for (i in order.indices) {
            orderMap[order[i] - 'a'] = i
        }
        return orderMap
    }
}