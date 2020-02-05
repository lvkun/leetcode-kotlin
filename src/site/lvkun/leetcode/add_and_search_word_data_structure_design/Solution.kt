package site.lvkun.leetcode.add_and_search_word_data_structure_design

class WordDictionary() {

    /** Initialize your data structure here. */
    private val root = Node()

    /** Adds a word into the data structure. */
    fun addWord(word: String) {
        root.addWord(word, 0)
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    fun search(word: String): Boolean {
        return root.search(word, 0)
    }

    private class Node {
        private val children = Array<Node?>(26) { null }
        private var isEnd = false

        fun addWord(word: String, pos: Int) {
            if (pos == word.length) {
                isEnd = true
                return
            }

            val index = word[pos] - 'a'
            children[index] = Node()
            children[index]?.addWord(word, pos + 1)
        }

        fun search(word: String, pos: Int): Boolean {
            if (pos == word.length) {
                return isEnd
            }

            val c = word[pos]

            if (c == '.') {
                for (n in children) {
                    if (n != null && n.search(word, pos + 1)) {
                        return true
                    }
                }
                return false
            } else {
                val index = c - 'a'
                return children[index]?.search(word, pos + 1) ?: false
            }
        }
    }
}