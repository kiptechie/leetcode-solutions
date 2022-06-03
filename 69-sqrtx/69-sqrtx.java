class Solution {
    public int mySqrt(int x) {
        Integer left = 1;
        Integer right = x;
        while(left <= right){
            Long mid = left.longValue() + (right.longValue() - left.longValue()) / 2L;
            if(mid * mid == x) {
                return mid.intValue();
            }
            if(mid * mid > x) {
                right = mid.intValue() - 1;
            } else{
                left = mid.intValue() + 1;
            }
        }
        return right;
    }
}