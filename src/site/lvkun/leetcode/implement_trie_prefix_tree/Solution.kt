package site.lvkun.leetcode.implement_trie_prefix_tree

class Trie() {

    /** Initialize your data structure here. */
    val root = Node()

    /** Inserts a word into the trie. */
    fun insert(word: String) {
        var node = root
        for (c in word) {
            if (!node.contains(c)) {
                node.addNode(c)
            }
            node = node.getNode(c)!!
        }
        node.isEnd = true
    }

    /** Returns if the word is in the trie. */
    fun search(word: String): Boolean {
        var node = root
        for (c in word) {
            if (!node.contains(c)) {
                return false
            }
            node = node.getNode(c)!!
        }

        return node.isEnd
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    fun startsWith(prefix: String): Boolean {
        var node = root
        for (c in prefix) {
            if (!node.contains(c)) {
                return false
            }
            node = node.getNode(c)!!
        }

        return true
    }

    class Node {
        private val children = Array<Node?>(26) {_ -> null}
        var isEnd = false

        private fun Char.toIndex(): Int {
            return this - 'a'
        }

        fun addNode(c: Char) {
            children[c.toIndex()] = Node()
        }

        fun getNode(c: Char): Node? {
            return children[c.toIndex()]
        }

        fun contains(c: Char): Boolean {
            return children[c.toIndex()] != null
        }
    }
}