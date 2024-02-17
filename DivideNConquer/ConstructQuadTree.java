public class ConstructQuadTree {
    
    static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;
            
        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

    }

    private static boolean AllSame(int[][] grid, int x, int y, int n) {
        int val = grid[x][y];
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (grid[i][j] != val) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Node solve(int[][] grid, int x, int y, int n) {
        if (AllSame(grid, x, y, n)) {
            boolean val=false;
            if(grid[x][y]==1) val = true;
            return new Node(val, true);
        } else {
            Node root = new Node(true, false);
            root.topLeft = solve(grid, x, y, n / 2);
            root.topRight = solve(grid, x, y + n / 2, n / 2);
            root.bottomLeft = solve(grid, x + n / 2, y, n / 2);
            root.bottomRight = solve(grid, x + n / 2, y + n / 2, n / 2);

            return root;
        }
    }

    public static Node construct(int[][] grid) {
        return solve(grid, 0, 0, grid.length);
    }
    
    public static void main(String[] args) {

        int [][] grid = {{0,1},{1,0}};        
        construct(grid);
        
    }
}
