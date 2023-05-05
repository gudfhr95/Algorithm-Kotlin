class Solution {
    fun postorder(root: Node?): List<Int> {
        val result = mutableListOf<Int>()

        root?.run {
            for(child in root.children){
                result += postorder(child)
            }
            result += listOf(root.`val`)
        }

        return result
    }
}