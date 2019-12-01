package site.lvkun.leetcode.course_schedule

import java.util.*

class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val indegrees = IntArray(numCourses)
        for (prerequisite in prerequisites) {
            indegrees[prerequisite[0]]++
        }

        val deque = ArrayDeque<Int>()
        for (i in 0 until numCourses) {
            if (indegrees[i] == 0) {
                deque.offerLast(i)
            }
        }

        var num = numCourses
        while (deque.isNotEmpty()) {
            val i = deque.pollFirst()
            num--
            for (req in prerequisites) {
                if (req[1] != i) {
                    continue
                }

                indegrees[req[0]]--

                if (indegrees[req[0]] == 0) {
                    deque.offerLast(req[0])
                }
            }
        }

        return num == 0
    }
}