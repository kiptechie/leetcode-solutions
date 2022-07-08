class Solution {
    
     private boolean checkPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // Found a mismatched pair - try both deletions
            if (s.charAt(left) != s.charAt(right)) {
                return (checkPalindrome(s, left, right - 1) || 
                        checkPalindrome(s, left + 1, right));
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}