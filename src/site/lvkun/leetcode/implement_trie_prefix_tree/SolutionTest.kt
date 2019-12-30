package site.lvkun.leetcode.implement_trie_prefix_tree

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun test() {
        val trie = Trie()

        trie.insert("apple")
        Assert.assertTrue(trie.search("apple"))
        Assert.assertFalse(trie.search("app"))
        Assert.assertTrue(trie.startsWith("app"))
        trie.insert("app")
        Assert.assertTrue(trie.search("app"))
    }
}