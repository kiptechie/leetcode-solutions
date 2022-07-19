class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        
        int res = 0;
        
        for (int i = 1; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i)).toUpperCase();
            String prevLetter = String.valueOf(s.charAt(i - 1)).toUpperCase();
            if (map.containsKey(letter) && map.containsKey(prevLetter)) {
                int val = map.get(letter);
                int prevVal = map.get(prevLetter);
                if (prevVal < val) {
                    res -= map.get(prevLetter);
                } else {
                    res += map.get(prevLetter);
                }
            }
        }
        res += map.get(String.valueOf(s.charAt(s.length() - 1)));
        return res;
    }
}