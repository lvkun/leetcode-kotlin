package site.lvkun.leetcode.binary_tree_paths

import site.lvkun.leetcode.common.TreeNode

class Solution {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) {
            return emptyList()
        }

        val result = binaryTreePathsInternal(root.left)
        result.addAll(binaryTreePathsInternal((root.right)))

        if (result.isEmpty()) {
            result.add(mutableListOf())
        }

        return result.map {
            it.add(0, root.`val`.toString())
            it
        }.map { it.joinToString("->") }
    }

    private fun binaryTreePathsInternal(root: TreeNode?): MutableList<MutableList<String>> {
        if (root == null) {
            return mutableListOf()
        }

        val result = binaryTreePathsInternal(root.left)
        result.addAll(binaryTreePathsInternal((root.right)))

        if (result.isEmpty()) {
            result.add(mutableListOf())
        }

        return result.map {
            it.add(0, root.`val`.toString())
            it
        }.toMutableList()
    }
}