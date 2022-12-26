class Solution {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        var currentQueue = ArrayDeque<TreeNode>()
        var nextQueue = ArrayDeque<TreeNode>()

        var depth = 0

        currentQueue.add(root)

        while (!currentQueue.isEmpty()) {
            depth += 1

            while (!currentQueue.isEmpty()) {
                val cur = currentQueue.remove()

                if (cur.left == null && cur.right == null) {
                    return depth
                }

                cur.left?.let { nextQueue.add(it) }
                cur.right?.let { nextQueue.add(it) }
            }

            if (nextQueue.size == 0) {
                break
            }

            currentQueue = nextQueue
            nextQueue = ArrayDeque<TreeNode>()
        }

        return depth
    }
}