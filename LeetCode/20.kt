class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (c in s) {
            if (c == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return false
                }
                stack.pop()
            } else if (c == '}') {
                if (stack.empty() || stack.peek() != '{') {
                    return false
                }
                stack.pop()
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return false
                }
                stack.pop()
            } else {
                stack.push(c)
            }
        }

        return stack.empty()
    }
}