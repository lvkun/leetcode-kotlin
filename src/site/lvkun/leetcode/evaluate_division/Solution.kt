package site.lvkun.leetcode.evaluate_division

class Solution {
    fun calcEquation(equations: List<List<String>>, values: DoubleArray, queries: List<List<String>>): DoubleArray {
        val graph = Graph()

        for (i in equations.indices) {
            val equation = equations[i]
            val value = values[i]

            graph.addEdge(equation[0], equation[1], value)
        }

        val result = DoubleArray(queries.size)
        for (i in queries.indices) {
            val query = queries[i]
            result[i] = graph.dfs(query[0], query[1])
        }

        return result
    }

    class Graph {
        val nodeMap = mutableMapOf<String, Node>()

        fun addEdge(from: String, to: String, value: Double) {
            nodeMap.putIfAbsent(from, Node())
            nodeMap.putIfAbsent(to, Node())

            nodeMap[from]?.addEdge(to, value)
            nodeMap[to]?.addEdge(from, 1 / value)
        }

        fun dfs(from: String, target: String): Double {
            if (!nodeMap.containsKey(from) || !nodeMap.containsKey(target)) {
                return -1.0
            }

            val visited = mutableMapOf<String, Boolean>()
            return dfs(from, target, visited) ?: -1.0
        }

        fun dfs(from: String, target: String, visited: MutableMap<String, Boolean>): Double? {
            if (visited.getOrDefault(from, false)) {
                return null
            }

            val fromNode = nodeMap[from]
            visited[from] = true

            if (fromNode != null) {
                if (target in fromNode.edgeMap.keys) {
                    return fromNode.edgeMap[target]
                }

                for (entry in fromNode.edgeMap.entries) {
                    val v = dfs(entry.key, target, visited)
                    if (v != null) {
                        return entry.value * v
                    }
                }
            }

            return null
        }
    }

    class Node {
        val edgeMap = mutableMapOf<String, Double>()

        fun addEdge(node: String, value: Double) {
            edgeMap[node] = value
        }
    }
}