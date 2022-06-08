class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        if (nums.length == 0) {
            return res;
        }
        int firstIndex = findStartIndex(nums, target);
        int lastIndex = -1;
        if (firstIndex != -1) {
            lastIndex = findLastIndex(nums, target);
        }
        return new int[]{firstIndex, lastIndex};
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