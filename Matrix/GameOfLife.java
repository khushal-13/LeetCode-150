import java.util.*;

public class GameOfLife {

    public static void Method3(int board[][]){
        int dir[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        int m=board.length, n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=0;
                for (int[] d : dir) {
                    int p = i+d[0];
                    int q = j+d[1];
                    
                    if(p>=0 && p<m && q>=0 && q<n && (board[p][q]==1 || board[p][q]==2)){
                        count++;
                    }    
                }
                //2 : alive -> dead
                if(board[i][j]==1){
                    if(count<2 || count>3){
                        board[i][j] = 2;
                    }
                }
                //3 : dead -> alive
                else{
                    if(count==3){
                        board[i][j] = 3;
                    }
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j] = board[i][j]%2;
            }
        } 
        print(board);
    }    

    public static void Method2(int board[][]){
        int dir[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        int m=board.length, n=board[0].length;
        int ans[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=0;
                for (int[] d : dir) {
                    int p = i+d[0];
                    int q = j+d[1];
                    
                    if(p>=0 && p<m && q>=0 && q<n && board[p][q]==1){
                        count++;
                    }    
                }
                if(board[i][j]==1){
                    if(count==2 || count==3){
                        ans[i][j] = 1;
                    }
                }
                else{
                    if(count==3){
                        ans[i][j] = 1;
                    }
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j] = ans[i][j];
            }
        } 
        print(board);
    }

    public static void checkOne(int board[][], int m, int n, int row, int col, int ans[][]){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=row-1;i<row-1+3;i++){
            for(int j=col-1;j<col-1+3;j++){
                if(i==row && j==col) continue;
                if(i>=0 && i<m && j>=0 && j<n){
                    freq.put(board[i][j], freq.getOrDefault(board[i][j], 0)+1);                    
                }
            }
        }
        if(freq.get(1)==2 || freq.get(1)==3) {
            ans[row][col] = 1;
        }
    }

    public static void checkZero(int board[][], int m, int n,int row, int col, int ans[][]){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=row-1;i<row-1+3;i++){
            for(int j=col-1;j<col-1+3;j++){
                if(i==row && j==col) continue;
                if(i>=0 && i<m && j>=0 && j<n){
                    freq.put(board[i][j], freq.getOrDefault(board[i][j], 0)+1);
                }
            }
        }    
        if(freq.get(1)==3){
            ans[row][col] = 1;
        }
    }

    public static void Method1(int board[][]){
        int m=board.length, n=board[0].length;
        int ans[][] = new int[m][n];
        Arrays.stream(ans).forEach(a -> Arrays.fill(a, 0));
        print(ans);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    checkZero(board,m,n,i,j,ans);
                }
                else{
                    checkOne(board,m,n,i,j,ans);
                }
            }
        }
        board = Arrays.stream(ans).map(int[]::clone).toArray(int[][]::new);
        print(board);
    }

    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        int board[][] = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        //int board[][] = {{1,1},{1,0}};
        print(board);
        Method3(board);
    
    }
}
