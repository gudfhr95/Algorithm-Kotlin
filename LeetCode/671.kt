class Solution {

    val set = TreeSet<Int>()

    fun findSecondMinimumValue(root: TreeNode?): Int {
        dfs(root)

        val list = set.toList()

        return list.getOrNull(1) ?: -1
    }

    fun dfs(node: TreeNode?){
        if(node == null){
            return
        }

        set.add(node.`val`)

        dfs(node.left)
        dfs(node.right)
    }
}