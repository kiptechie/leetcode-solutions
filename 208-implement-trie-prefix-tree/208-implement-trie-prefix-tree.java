class Trie {
    
    private Node root;

    public Trie() {
        root = new Node('\0');
    }
    
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (curr.letters[letter - 'a'] == null) {
                curr.letters[letter - 'a'] = new Node(letter);
            }
            curr = curr.letters[letter - 'a'];
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        Node node = getNode(word);
        return node != null && node.isWord;
    }
    
    private Node getNode(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (curr.letters[letter - 'a'] == null) {
                return null;
            }
            curr = curr.letters[letter - 'a'];
        }
        return curr;
    }
    
    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }
    
    private class Node {
        
        public char letter;
        public boolean isWord;
        public Node[] letters;
        
        public Node(char letter) {
            this.letter = letter;
            isWord = false;
            letters = new Node[26];
        }
        
        @Override
        public String toString() {
            return "{ Node: letter-" + letter + ", isword-" + isWord + ", letters-" + Arrays.toString(letters) + "}";
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */