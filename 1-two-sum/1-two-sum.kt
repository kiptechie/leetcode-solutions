class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map: HashMap<Int, Int> = HashMap()
        for ((index, num) in nums.withIndex()) {
            map.put(nums[index], index)
        }
        for ((index, num) in nums.withIndex()) {
            val complement = target - nums[index]
            if (map.containsKey(complement) && 
                    map[complement] != index)             {
                return listOf(
                    index, 
                    map[complement] ?: index + 1
                ).toIntArray()
            }
        }
        return nums
    }
}