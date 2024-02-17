import java.util.Arrays;

public class Search2D{

    public static boolean Method1(int[][] matrix, int target){
        int m=matrix.length,n=matrix[0].length;
        int ans = -1;
        for(int i=0;i<m;i++){
            if(target>=matrix[i][0] && target<=matrix[i][n-1]){
                int []row = matrix[i];
                ans = Arrays.binarySearch(row,0,n-1,target);
                break;
            }
        }
        System.out.println(ans);
        if(ans<0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1}};
        System.out.println(Method1(matrix, 0));
        
    }
}