class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        var result = 1
        var currentQueue = ArrayDeque<TreeNode>()
        var nextQueue = ArrayDeque<TreeNode>()

        currentQueue.add(root)

        while (true) {
            while (!currentQueue.isEmpty()) {
                val cur = currentQueue.remove()

                cur.left?.let { nextQueue.add(it) }
                cur.right?.let { nextQueue.add(it) }
            }

            if (nextQueue.size == 0) {
                break
            }

            currentQueue = nextQueue
            nextQueue = ArrayDeque<TreeNode>()

            result += 1
        }

        return result
    }
}