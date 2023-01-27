class MyStack() {

    val queue = ArrayDeque<Int>()

    fun push(x: Int) {
        queue.addFirst(x)
    }

    fun pop(): Int {
        return queue.removeFirst()
    }

    fun top(): Int {
        return queue.first()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }
}