package site.lvkun.leetcode.add_and_search_word_data_structure_design

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testWordDictionary() {
        val dictionary = WordDictionary()
        dictionary.addWord("bad")
        dictionary.addWord("dad")
        dictionary.addWord("mad")
        print(dictionary.search("."))
        Assert.assertFalse(dictionary.search("pad"))
        Assert.assertTrue(dictionary.search("bad"))
        Assert.assertTrue(dictionary.search(".ad"))
        Assert.assertTrue(dictionary.search("b.."))
    }
}