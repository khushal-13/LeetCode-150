public class SurroundedRegions {

    public static void dfsUtil(char board[][], int i, int j, int m, int n){
        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!='O') return;

        board[i][j] = '*';

            dfsUtil(board, i+1, j,m,n);
            dfsUtil(board, i-1, j,m,n);
            dfsUtil(board, i, j+1,m,n);
            dfsUtil(board, i, j-1,m,n);
    }

    public static void Method2(char board[][]){
        int m=board.length, n=board[0].length;

        for(int j=0;j<n;j++){
            if(board[0][j]=='O'){
                dfsUtil(board, 0, j, m, n);
            }
            if(board[m-1][j]=='O'){
                dfsUtil(board, m-1, j, m, n);
            }
        }

        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                dfsUtil(board, i, 0, m, n);
            }
            if(board[i][n-1]=='O'){
                dfsUtil(board, i, n-1, m, n);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //Order is important 
                // #1
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }

                //#2
                if(board[i][j]=='*'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    private static boolean dfs(char board[][], int i, int j){
        if(i>0 && j>0 && i<board.length && j<board[0].length && board[i][j]=='O'){
            boolean down  = dfs(board, i+1, j);
            boolean up    = dfs(board, i-1, j);
            boolean right = dfs(board, i, j+1);
            boolean left  = dfs(board, i, j-1);

            if(up && down && left && right){
                board[i][j] = 'X';
                return true;
            }
        }

        if(board[i][j]=='X'){
            return true;
        }else{
            return false;
        }
    }
    
    public static void Method1(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board, i, j);
            }
        }
    }
    public static void main(String[] args) {

        String board[][] = {{"X","X","X","X"},
                            {"X","O","O","X"},
                            {"X","X","O","X"}};
                           // {"X","O","X","X"} };

            System.out.println(board.length);
            System.out.println(board[0].length);
    }
}
