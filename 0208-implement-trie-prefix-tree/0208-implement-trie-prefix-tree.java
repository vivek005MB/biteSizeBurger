class TrieNode{
    boolean isEndWord;
    TrieNode[] child;
    TrieNode(){
        isEndWord = false;
        child = new TrieNode[26];
    }
}
class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        // T.c : O(len of word)
        
        
        TrieNode current = root;
        int n = word.length();
        for(int i = 0; i<n; i++)
        {
            int index = word.charAt(i) - 'a';
            if(current.child[index] == null)
            {
                current.child[index] = new TrieNode();
            }
            current = current.child[index];
        }
        current.isEndWord = true;
        
    }
    
    public boolean search(String word) {
        TrieNode current = root;
        int n = word.length();
        for(int i = 0; i<n;i++)
        {
            int index = word.charAt(i) - 'a';
            if(current.child[index] == null) return false;
            current = current.child[index];
        }
        return current.isEndWord;
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        int n = prefix.length();
        for(int i = 0; i<n;i++)
        {
            int index = prefix.charAt(i) - 'a';
            if(current.child[index] == null)return false;
            current = current.child[index];
        }
        return true;   
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */