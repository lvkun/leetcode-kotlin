package site.lvkun.leetcode.lru_cache

import java.util.LinkedHashMap

class LRUCache(capacity: Int) {

    private val map = MyLinkedHashMap(capacity)

    fun get(key: Int): Int {
        return map.getOrDefault(key, -1)
    }

    fun put(key: Int, value: Int) {
        map[key] = value
    }

//    private class MyLinkedHashMap(val capacity: Int) : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
//        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?): Boolean {
//            return size > capacity
//        }
//    }

    private class MyLinkedHashMap(val capacity: Int) {

        private var head: Entry = Entry(-1, -1)
        private var tail: Entry = Entry(-2, -1)

        init {
            head.after = tail
            tail.before = head
        }

        private val map = HashMap<Int, Entry>()

        private class Entry(val key: Int, val value: Int) {
            var before: Entry? = null
            var after: Entry? = null
        }

        operator fun set(key: Int, value: Int) {
            val entry = Entry(key, value)

            if (map.containsKey(key)) {
                val oldEntry = map[key]!!
                removeEntry(oldEntry)
            }

            insertToHead(entry)
            map[key] = entry

            while (map.size > capacity) {
                val oldEntry = tail.before
                removeEntry(oldEntry!!)
                map.remove(oldEntry.key)
            }
        }

        private fun insertToHead(entry: Entry) {
            val after = head.after
            head.after = entry
            entry.before = head
            entry.after = after
            after?.before = entry
        }

        private fun removeEntry(entry: Entry) {
            entry.before?.after = entry.after
            entry.after?.before = entry.before
        }

        fun getOrDefault(key: Int, default: Int): Int {
            return if (map.containsKey(key)) {
                val entry = map[key]!!
                removeEntry(entry)
                insertToHead(entry)
                entry.value
            } else {
                default
            }
        }
    }
}