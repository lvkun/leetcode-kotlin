package site.lvkun.leetcode.common

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    constructor(value: Int, leftNode: TreeNode? = null, rightNode: TreeNode? = null) : this(value){
        left = leftNode
        right = rightNode
    }

}