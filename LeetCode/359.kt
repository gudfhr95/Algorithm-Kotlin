class Logger() {

    val map = mutableMapOf<String, Int>()

    fun shouldPrintMessage(timestamp: Int, message: String): Boolean {
        if (map.containsKey(message)) {
            val t = map.get(message)!!
            if (t + 10 > timestamp) {
                return false
            }
        }

        map.put(message, timestamp)
        return true
    }
}