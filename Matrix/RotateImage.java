public class RotateImage {

    public static void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void Method1(int matrix[][]){

        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                swap(matrix,i,j);
            }
        }
        print(matrix);

        for(int i=0;i<matrix.length;i++){
            int l=0,r=matrix[0].length-1;
            while(l<r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }

        print(matrix);
        
    }

    public static void print(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        int matrix[][] = {{1,2,3,},{4,5,6},{7,8,9}};
        print(matrix);
        Method1(matrix);
        
    }
}
