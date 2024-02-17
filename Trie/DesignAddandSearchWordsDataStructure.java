public class DesignAddandSearchWordsDataStructure {
    
    class WordDictionary {

        class Node {
            boolean eow = false;
            Node children[] = new Node[26];
            int frequency=1;
            public Node(){
                for(int i=0;i<children.length;i++){
                    children[i]=null;
                }
            }
        }

        Node root;    

        public WordDictionary() {
            root = new Node();            
        }
        
        public void addWord(String word) {
            Node curr = root;
            for(int i=0;i<word.length();i++){
                int idx = word.charAt(i) - 'a';
                if(curr.children[idx]==null){
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
            curr.eow = true;
        }

        // Search Util isliye Kyuki "." wale case mein ROOT change ho raha hai
        public boolean searchUtil(Node currRoot, String word){
            Node curr = currRoot;
            for(int i=0;i<word.length();i++){
                int c = word.charAt(i);
                int idx = c - 'a';

                if(c=='.'){
                    for(int j=0;j<26;j++){
                        if(curr.children[j]!=null){
                            if(searchUtil(curr.children[j], word.substring(i+1))){
                                return true;
                            }
                        }
                    }
                    return false;                    
                }
                if(curr.children[idx]==null){
                    return false;
                }
                curr = curr.children[idx];
            }
            return curr!=null && curr.eow;     
        }
        
        public boolean search(String word) {
            return searchUtil(root, word);                 
        }
    }
}
