class Solution {

    val set = TreeSet<Int>()

    fun getMinimumDifference(root: TreeNode?): Int {
        dfs(root)

        val list = set.toList()
        var result = Int.MAX_VALUE
        for(i in 1..list.lastIndex){
            result = Math.min(result, list[i] - list[i-1])
        }

        return result
    }

    fun dfs(root: TreeNode?) {
        if(root == null){
            return
        }

        set.add(root.`val`)

        dfs(root.left)
        dfs(root.right)
    }
}