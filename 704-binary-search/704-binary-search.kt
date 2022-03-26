class Solution {
    fun search(nums: IntArray, target: Int): Int {
        return searchRecursive(nums, target, 0, nums.size - 1)
    }
    fun searchRecursive(nums: IntArray, target: Int, left: Int, right: Int): Int {
        if (left > right) {
            return -1
        }
        val mid = left + ((right - left) / 2)
        if (nums[mid] == target) {
            return mid
        } else if (target < nums[mid]) {
            return searchRecursive(nums, target, left, mid - 1)
        } else {
            return searchRecursive(nums, target, mid + 1, right)
        }
    }
}