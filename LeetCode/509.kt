class Solution {
    fun fib(n: Int): Int {
        if(n < 2){
            return n
        }

        return fib(n-1) + fib(n-2)
    }
}