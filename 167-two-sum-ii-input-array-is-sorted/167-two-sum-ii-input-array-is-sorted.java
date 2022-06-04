class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i1 = 0;
        int i2 = 0;        
        for(int i = 1; i < numbers.length; i++){
            int hi = i;
            int lo = 0;
            int tar = target - numbers[i];
            while(lo <= hi){
                int mid = lo + (hi - lo) / 2;
                if(numbers[mid] == tar) {
                    i1 = mid;
                    i2 = i;
                    break;
                } 
                if(numbers[mid] < tar) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return new int[]{i1 + 1, i2 + 1};
    }
}