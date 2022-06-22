class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); // O(n log n)
        return nums[nums.length - k];
    }
}