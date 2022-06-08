class Solution {
    public int removePalindromeSub(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if (s.charAt(right) != s.charAt(left)) {
                return 2;
            }
            left++;
            right--;
        }
        return 1;
    }
}