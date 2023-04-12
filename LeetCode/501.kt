class Solution {
    fun findMode(root: TreeNode?): IntArray {
        val map = mutableMapOf<Int, Int>()

        val q = ArrayDeque<TreeNode>()
        root?.let { q.add(it) }

        while(!q.isEmpty()){
            val cur = q.remove()

            map.put(cur.`val`, map.getOrDefault(cur.`val`, 0) + 1)

            cur.left?.let { q.add(it) }
            cur.right?.let { q.add(it) }
        }

        var max = Int.MIN_VALUE
        for((key, value) in map){
            max = Math.max(max, value)
        }

        val result = mutableListOf<Int>()
        for((key, value) in map){
            if(value == max){
                result.add(key)
            }
        }

        return result.toIntArray()
    }
}