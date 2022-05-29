class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointerA = 0;
        int pointerB = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while(pointerB < s.length()) {
            if (!set.contains(s.charAt(pointerB))) {
                set.add(s.charAt(pointerB));
                pointerB++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(pointerA));
                pointerA++;
            }
        }
        return max;
    }
}