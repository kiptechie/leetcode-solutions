class Solution {
    public int findMin(int[] nums) {
        // on malformed array return -1;
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // if one item is in the array return the item;
        if (nums.length == 1) {
            return nums[0];
        }
        // if the first element is less than the last element, this means the array was not rotated hence the first element is the minimum
        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        // edge case for two elements
        if (nums.length == 2) {
            if (nums[0] == nums[nums.length - 1]) {
                return nums[0];
            }
            if (nums[0] < nums[nums.length - 1]) {
                return nums[0];
            } else {
                return nums[nums.length - 1];
            }
        }
        int left = 0;
        int right = nums.length - 1;
        // binary search
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int curr = nums[mid];
            int next = nums[mid + 1];
            int prev = 0;
            // handle index out of bounds
            if ((mid - 1) > 0) {
                prev = nums[mid - 1];
            }
            // if current element is greater than the next value then the next value is our minimum
            if (curr > next) {
                return next;
            }
            // if curr element is less than the previous element this is our minimum
            if (curr < prev) {
                return curr;
            }
            // if the current element is greater than the first element in our iteration we search towards the right otherwise we search towards the left
            if (curr > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}