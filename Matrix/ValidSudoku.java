public class ValidSudoku{

    public static boolean isSafe(char[][] board, int row,int col, char curr){
        for(int i=0;i<9;i++){
            if(i==col) continue;
            if(board[row][i]==curr) return false;
        }
        for(int i=0;i<9;i++){
            if(i==row) continue;
            if(board[i][col]==curr) return false;
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(i==row && j==col) continue;
                if(board[i][j]==curr) return false;
            }
        }
        return true;
    }

    public static boolean Method1(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                if(!isSafe(board,i,j,board[i][j])){
                    return false;                    
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {


        
    }
}