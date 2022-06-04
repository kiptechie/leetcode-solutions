class Solution {
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        long k, curr;
        while(left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;
            if (curr == n) {
                return (int) k;
            }
            if (n < curr) {
                right = (int) k - 1;
            } else {
                left = (int) k + 1;
            }
        }
        return (int) right;
    }
}