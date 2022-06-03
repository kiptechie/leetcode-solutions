class Solution {
    
    public int firstOcc(int[] nums, int target, int low, int high) {
        while(low <= high) {
            int mid = low + (high - low) / 2; 
            if(nums[mid] > target)
                high = mid - 1;
            else if(nums[mid] < target)
                low = mid + 1;
            else {
                if(mid == 0 || nums[mid] != nums[mid-1])
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
    
    public int lastOcc(int[] nums, int target, int low, int high) {
        while(low <= high) {
            int mid = low + (high-low) / 2;
            if(nums[mid] > target)
                high = mid - 1;
            else if(nums[mid] < target)
                low = mid + 1;
            else{
                if(mid == nums.length - 1 || nums[mid] != nums[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int first = firstOcc(nums,target, low, high);
        int last  = lastOcc(nums,target, low, high);
        int res[] = {first, last};
        return res;
    }
}