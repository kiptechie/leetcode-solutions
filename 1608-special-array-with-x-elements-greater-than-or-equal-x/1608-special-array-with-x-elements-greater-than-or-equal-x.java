class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        while(n > 0) {
          int low = 0;
          int high = nums.length - 1;
          int mid = low + (high-low) / 2;
          int index = -1; 
          while(low <= high) {
              mid = low + (high - low) / 2;
               if(nums[mid] < n) {
                  low = mid + 1;
              } else {
                 index = mid;
                 high = mid - 1;
              }
          }
          if((nums.length - index) == n) {
              return n;
          }
          n--;       
        }
        return -1;
    }
}