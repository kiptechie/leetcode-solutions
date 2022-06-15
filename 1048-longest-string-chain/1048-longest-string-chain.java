class Solution {
    
    public int longestStrChain(String[] words) {
        Map<String, Integer> mp = new HashMap<>();
        Arrays.sort(words, (a, b) -> (a.length() - b.length()));
        int res = 0;
        for(String word : words) {
            int len = 0;
            for(int i = 0; i < word.length(); i++) {  
                String w = word.substring(0, i) + word.substring(i + 1);
                len = Math.max(len, mp.getOrDefault(w, 0) + 1);
            }
            res = Math.max(res, len);
            mp.put(word, len);
        }
        return res;
    }
    
}