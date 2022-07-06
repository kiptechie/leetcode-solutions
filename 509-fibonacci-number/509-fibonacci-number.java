class Solution {
    public int fib(int n) {
        // if (n < 3) {
        //     return 1;
        // }
        // return fib(n - 1) + fib(n - 2);
        if (n == 0) {
            return n;
        }
        // with memo
        return (int) memoizedFib(n, new HashMap<>());
    }
    
    private long memoizedFib(int n, HashMap<Integer, Long> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n < 3) {
            return 1;
        }
        memo.put(n, memoizedFib(n - 1, memo) + memoizedFib(n - 2, memo));
        return memo.get(n);
    }
}