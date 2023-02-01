class MyQueue() {

    val queue = ArrayDeque<Int>()

    fun push(x: Int) {
        queue.add(x)
    }

    fun pop(): Int {
        return queue.remove()
    }

    fun peek(): Int {
        return queue.first()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}