package site.lvkun.leetcode.common

class ListNode(var value: Int) {
    var next: ListNode? = null

    companion object {
        fun fromString(str: String): ListNode? {
            val dummy = ListNode(-1)
            var prev = dummy
            for (item in str.split("->")) {
                prev.next = ListNode(Integer.valueOf(item.trim()))
                prev = prev.next!!
            }

            return dummy.next
        }
    }

    override fun toString(): String {
        if (next != null) {
            return value.toString() + "->" + next.toString()
        }

        return value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListNode

        if (value != other.value) return false
        if (next != other.next) return false

        return true
    }

    override fun hashCode(): Int {
        var result = value
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}