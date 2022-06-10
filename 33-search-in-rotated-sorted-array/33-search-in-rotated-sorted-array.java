class Solution {
    public int search(int[] nums, int target) {
        // find the smallest index and choose what side to search on
        
        // return -1 if nums is empty or null
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            //  The middle element matches the target
            if (nums[mid] == target) {
                return mid;
            }

            // The left half is sorted
            if (nums[left] <= nums[mid]) {
                // The target lies in the sorted half
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else { // The target lies in the unsorted half
                    left = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                // The target lies in the sorted half
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else { // The key lies in the unsorted half
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }
    
}