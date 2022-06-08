class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums.length == 0) {
            return res;
        }
        res[0] = findStartIndex(nums, target);
        if (res[0] != -1) {
            res[1] = findLastIndex(nums, target);
        }
        return res;
    }
    
    private int findStartIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            int curr = nums[mid];
            if (curr >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (nums[left] != target) {
            return -1;
        }
        return left;
    }
    
    private int findLastIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int mid = left  + (right - left) / 2;
            int curr = nums[mid];
            if (curr > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left - 1;
    }
    
}