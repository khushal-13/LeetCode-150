public class nQueens {

    static int count=0;

    public static boolean isSafe(char board[][], int row, int col){
        //Vertical-UP
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q') return false;
        }

        //Left-Diagonal-UP
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q') return false;
        }

        //Right-Diagonal-UP
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }

    public static void Method1(char board[][], int row){
        if(row==board.length){
            print(board); 
            count++;
            return;
        }
        for(int j=0;j<board[0].length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                Method1(board, row+1); 
                board[row][j] = 'x';
            }
        }      
    }

    public static int totalNQueens(int n) {
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = 'x';
            }
        }
        Method1(board,0);
        return count;    
    }

    public static void print(char board[][]){
        System.out.println("------------CHESS BOARD-----------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        int n=4;
        System.out.println(totalNQueens(n));
        // char board[][] = new char[n][n];
        // for(int i=0;i<board.length;i++){
        //     for(int j=0;j<board[0].length;j++){
        //         board[i][j] = 'x';
        //     }
        // }
        // //print(board);
        // Method1(board,0);
        // System.out.println(count);

    }
}
