public class ImplementTrie{

    

    class Trie {

        class Node {
            boolean eow = false;
            Node children[] = new Node[26];
            int frequency = 1;
            public Node(){
                for (int i=0;i<children.length;i++) {
                    children[i] = null;
                }
            }
        }

        Node root;

        public Trie() {
            root = new Node();                       
        }
        
        public void insert(String word) {
            Node curr = root;
            for (Character ch : word.toCharArray()) {
                int idx = ch - 'a';
                if(curr.children[idx]==null){
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }                        
            curr.eow = true;
        }
        
        public boolean search(String word) {
            Node curr = root;
            for (Character ch : word.toCharArray()) {
                int idx = ch - 'a';
                if(curr.children[idx]==null){
                    return false;
                }
                curr = curr.children[idx];                
            }            
            return curr.eow;
        }
        
        public boolean startsWith(String prefix) {
            Node curr = root;
            int i;
            for (i=0;i<prefix.length();i++) {
                int idx = prefix.charAt(i) - 'a';
                if(curr.children[idx]==null){
                    return false;
                }
            }
            return true;
        }
    }


}