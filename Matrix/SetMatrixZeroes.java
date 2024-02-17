// import java.util.*;

public class SetMatrixZeroes {

    
    public static void Method2(int matrix[][]){
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    //Brute Force
    public static void Method1(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int k=0;
                    while(k<matrix[0].length){
                        if(matrix[i][k]==0){
                            k++;
                            continue;
                        }
                        matrix[i][k] = -1;
                        k++;
                    }

                    k=0;
                    while(k<matrix.length){
                        if(matrix[k][j]==0){
                            k++;
                            continue;
                        }
                        matrix[k][j] = -1;
                        k++;
                    }
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j] = 0;
                }
            }
        }
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
    public static void main(String args[]){

        int matrix[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        print(matrix);
        Method1(matrix);
        print(matrix);

    }
    
}
