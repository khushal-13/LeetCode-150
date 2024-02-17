import java.util.*;

public class WordSearch2 {

       // METHOD-1 Time Limit Exceeded
    // private boolean findWordsUtil(char[][] board, int i, int j, int m, int n, String word, int idx){
    //     if(idx>=word.length()){
    //         return true;
    //     }
    //     if(i<0 || j<0 || i>=m || j>=n || board[i][j]!=word.charAt(idx)){
    //         return false;
    //     }
        
    //     char temp = board[i][j];
    //     board[i][j] = '*';
    //     boolean found = findWordsUtil(board,i+1,j,m,n,word,idx+1) ||
    //                     findWordsUtil(board,i-1,j,m,n,word,idx+1) ||
    //                     findWordsUtil(board,i,j+1,m,n,word,idx+1) ||
    //                     findWordsUtil(board,i,j-1,m,n,word,idx+1);
    //     board[i][j] = temp;
    //     return found;
    // }

    // public List<String> findWords(char[][] board, String[] words) {
    //     List<String> res = new ArrayList<>();
    //     int m = board.length, n = board[0].length;

    //     for (int k = 0; k < words.length; k++) {
    //         String word = words[k];
    //         boolean flag = true;
    //         for (int i = 0; i < m; i++) {
    //             for (int j = 0; j < n; j++) {
    //                 if(board[i][j]==word.charAt(0)){
    //                     if(findWordsUtil(board,i,j,m,n,word,0) && flag){
    //                         res.add(word);
    //                         flag = false;
    //                     }
    //                 }                    
    //             }
    //         }
    //     }
    //     return res;
    // }

    class Node{
        boolean eow;
        String word;
        Node children[] = new Node[26];
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i] = null;
            }
            eow=false;
            word="";
        }
    }

    int m,n;
    List<String> ans = new ArrayList<>();

    private void insert(Node root, String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }        
        curr.eow = true;
        curr.word = word;
    }

    private void findWordsUtil(char[][] board, int i, int j, Node root){
        if(i<0 || j<0 || i>=m || j>=n) return;

        if(board[i][j]=='$' || root.children[board[i][j]-'a']==null) return;

        root = root.children[board[i][j]-'a'];

        if(root.eow==true){
            root.eow=false;
            ans.add(root.word);
        }

        char temp = board[i][j]; // Marking Visited
        board[i][j] = '$';

        findWordsUtil(board, i+1, j, root);
        findWordsUtil(board, i-1, j, root);
        findWordsUtil(board, i, j+1, root);
        findWordsUtil(board, i, j-1, root);

        board[i][j] = temp; // Marking Unvisited
    }

    public List<String> findWords(char[][] board, String[] words){
        m = board.length;
        n = board[0].length;
        Node root = new Node();
        for(int i=0;i<words.length;i++){
            insert(root, words[i]);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int idx = board[i][j]-'a';
                if(root.children[idx] != null){
                    findWordsUtil(board, i, j, root);
                }
            }
        } 
        return ans;
    }

    public static void main(String[] args) {
        WordSearch2 obj = new WordSearch2();
        
    }
}
