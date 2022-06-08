class Solution {
    public boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        int left = 0;
        int right = numStr.length() - 1;
        while(left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}