class Solution {
    fun preorder(root: Node?): List<Int> {
        val result = mutableListOf<Int>()

        root?.run {
            result += listOf(root.`val`)
            for(child in root.children){
                result += preorder(child)
            }
        }

        return result
    }
}