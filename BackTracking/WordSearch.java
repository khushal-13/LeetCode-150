public class WordSearch {

    public static boolean Method1Helper(char board[][], int m, int n, String word, int i, int j, int idx){
        if(idx>=word.length()){
            return true;
        }

        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!=word.charAt(idx)){
            return false;
        }
        
        char temp = board[i][j];
        board[i][j] = '*';
        boolean next = Method1Helper(board, temp, n, word, i-1, j, idx+1) ||
                       Method1Helper(board, temp, n, word, i+1, j, idx+1) ||
                       Method1Helper(board, temp, n, word, i, j-1, idx+1) ||
                       Method1Helper(board, temp, n, word, i, j+1, idx+1);
        board[i][j] = temp;
        return next;
    }

    public static boolean Method1(char board[][], String word){
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0) && Method1Helper(board, m, n, word, i, j, 0)){
                    return true;                    
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
    }

}
