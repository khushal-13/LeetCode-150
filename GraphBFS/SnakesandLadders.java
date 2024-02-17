import java.util.*;

public class SnakesandLadders {

    static int n;

    static class Pair{
        int row, col;
        public Pair(int r, int c){ this.row=r; this.col=c;}
    }

    public static Pair getPosition(int val){
        int RowTop = (val-1)/n;
        int row = (n-1) - RowTop;

        int col = (val-1)%n;
        if((n%2==0 && row%2==0) || (n%2==1 && row%2==1)){
            col = (n-1) - col;
        }
        return new Pair(row, col);
    }
    
    public static int Method1(int[][] board){
        n = board.length;
        int steps=0;
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        boolean vis[][] = new boolean[n][n];
        vis[n-1][0] = true;

        while (!q.isEmpty()) {
            int size = q.size();
            for(int i=0;i<size;i++) {
                int curr = q.poll();
                if(curr==n*n){
                    return steps;
                }

                for(int k=1;k<=6;k++){
                    int val = curr + k;

                    if(val>n*n) break;
                
                    Pair p = getPosition(val);
                    int r=p.row,c=p.col;

                    if(vis[r][c]==true) continue;
                    vis[r][c] = true;

                    if(board[r][c]==-1){
                        q.add(val);
                    }
                    else{
                        q.add(board[r][c]);
                    }
                }
            }
            steps++;
        }
        return 0;
    }
    public static void main(String[] args) {
        
    }
}
