class Solution {
    public int searchInsert(int[] nums, int target) {
        int lastNum = nums[nums.length - 1];
        if (target > lastNum) {
            return nums.length;
        }
        if (target == lastNum) {
            return nums.length - 1;
        }
        int firstNum = nums[0];
        if (target < firstNum) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        int wouldBe = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int curr = nums[mid];
            if (curr == target) {
                return mid;
            }
            if (curr < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            // check if target is within the range of current number and previous number
            if (target < curr && mid > 0 && target > nums[mid - 1]) {
                wouldBe = mid;
            }
        }
        return wouldBe;
    }
}