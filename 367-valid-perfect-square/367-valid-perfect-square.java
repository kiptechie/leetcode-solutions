class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
		// intialise end with num / 2, as if the square root exists then it will be at least half distance away from the given num.
        int right = num / 2;
		// Handle the input  num = 1 as a corner case*.
        if(num == 1) {
            return true;
        }
        while(left <= right){
            long mid = (left + right) / 2;
            if(mid * mid == num) {
                return true;
            } else if(mid * mid > num) {
                right = (int) mid - 1;
            } else if(mid * mid < num) {
                left = (int) mid + 1;
            }
        }
        return false;
    }
}