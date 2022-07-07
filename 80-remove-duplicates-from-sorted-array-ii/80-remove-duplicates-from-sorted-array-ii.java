class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        int k = 1;
        int currentVal = nums[0];
        while (j < nums.length) {
            if (nums[j] == currentVal) {
                k++;
            } else {
                currentVal = nums[j];
                k = 1;
            }
            if (k <= 2) {
                nums[i++] = currentVal;
            }
            j++;
        }
        return i;
    }
}