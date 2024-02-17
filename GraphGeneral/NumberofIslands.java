public class NumberofIslands{

    private static void dfs(char grid[][], int i, int j){
        while(i>=0 && i<grid.length && j>=0 && j<grid[0].length){
            if(grid[i][j]=='1'){
                grid[i][j] = '0';
            }
            dfs(grid, i-1, j);
            dfs(grid, i+1, j);
            dfs(grid, i, j-1);
            dfs(grid, i, j+1);
        }
    }

    public static int Method1(char grid[][]){
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}