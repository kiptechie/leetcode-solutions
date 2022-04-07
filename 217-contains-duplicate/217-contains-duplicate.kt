class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numSet = mutableSetOf<Int>()
        for (num in nums) {
            numSet.add(num)
        }
        return nums.size > numSet.size
    }
}