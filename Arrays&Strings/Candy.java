//import java.util.Arrays;

import java.util.Arrays;

public class Candy{

   

    public static int Method3(int rate[]){

        int arr[][] = new int[2][rate.length];
        int candy=0;
        Arrays.stream(arr).forEach(a -> Arrays.fill(a, 1));
      
        for(int i=1;i<rate.length;i++){
            if(rate[i]>rate[i-1]){
                arr[0][i] = arr[0][i-1]+1;
            }
        }

        for(int i=rate.length-2;i>=0;i--){
            if(rate[i]>rate[i+1]){
                arr[1][i] = arr[1][i+1]+1;
            }            
        }

        for(int i=0;i<rate.length;i++){
            candy += Math.max(arr[0][i], arr[1][i]);
        }

        return candy;
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


    public static int Method1(int [] ratings){
        int candy=ratings.length;
        for(int i=0;i<ratings.length;i++){
            if(i==0){
                if(ratings[i]>ratings[i+1]){
                    candy++;
                }
                continue;
            }
            if(i==ratings.length-1){
                if(ratings[i]>ratings[i-1]){
                    candy++;
                }
                continue;
            }

            if(ratings[i]>ratings[i-1]){
                candy++;
            }
            else if(ratings[i]>ratings[i+1]){
                candy++;
            }
        }
        return candy;
    }

    public static void main(String[] args) {

        int ratings[] = {1,2,87,87,87,2,1};
        //System.out.println(Method2(ratings));
        System.out.println(Method3(ratings));
        
    }
}