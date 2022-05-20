class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(target - nums[i])) {
                int ind1 = i;
                int ind2 = hm.get(target - nums[i]);
                
                ans[0] = ind1;
                ans[1] = ind2;
                
                return ans; 
            } else {
                hm.put(nums[i], i);
            }
        }
        return ans; 
    }
}