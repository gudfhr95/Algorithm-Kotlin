class Solution {
    fun maxDepth(root: Node?): Int {
        if(root == null){
            return 0
        }

        var currentQueue = ArrayDeque<Node>()
        var nextQueue = ArrayDeque<Node>()
        var result = 0

        currentQueue.add(root)

        while(true){
            result += 1

            while(!currentQueue.isEmpty()){
                val cur = currentQueue.remove()

                for(child in cur.children){
                    nextQueue.add(child)
                }
            }

            if(nextQueue.isEmpty()){
                break
            }

            currentQueue = nextQueue
            nextQueue = ArrayDeque<Node>()
        }

        return result
    }
}