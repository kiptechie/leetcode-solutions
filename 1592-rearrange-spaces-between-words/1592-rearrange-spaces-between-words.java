class Solution {
    public String reorderSpaces(String text) {
        // collect the words from the input & count the number of spaces
        List<String> words = new ArrayList<>();
        int numSpace = 0;
        StringBuilder word = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                ++numSpace;
                if (word.length() > 0) {
                    words.add(word.toString());
                    word = new StringBuilder();
                }
            }
            else {
                word.append(c);
            }
        }
        if (word.length() != 0) {
            words.add(word.toString());
        }
        
        // if only one word, deal with the corner case
        int size = words.size();
        int space = size == 1 ? 0 : numSpace / (size - 1);
        int trail = size == 1 ? numSpace : numSpace % (size - 1);
        
        // method to get space for specified name
        String spaceStr = " ".repeat(space);
        String trailStr = " ".repeat(trail);
        
        // append the word and spaces
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < size; ++i) {
            // the last word should append with trail spaces
            res.append(words.get(i)).append(i == size-1 ? trailStr : spaceStr);
        }
        return res.toString();
    }
}