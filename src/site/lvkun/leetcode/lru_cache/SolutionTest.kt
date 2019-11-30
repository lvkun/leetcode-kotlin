package site.lvkun.leetcode.lru_cache

import org.junit.Assert
import org.junit.Test

class SolutionTest {
    @Test
    fun testLRUCache() {
        val cache = LRUCache(2)
        cache.put(1, 1)
        cache.put(2, 2)
        Assert.assertEquals(1, cache.get(1))
        cache.put(3, 3)
        Assert.assertEquals(-1, cache.get(2))
        cache.put(4, 4)
        Assert.assertEquals(-1, cache.get(1) )
        Assert.assertEquals(3, cache.get(3))
        Assert.assertEquals(4, cache.get(4))
    }
}