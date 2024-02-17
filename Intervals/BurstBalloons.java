import java.util.*;

public class BurstBalloons {

    public static int Method2(int [][]points){
        //Sorted Based on END POINT
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        print(points);
        int count=0, arrow=0;
        for(int i=0;i<points.length;i++){
            if(i==0 || points[i][0]>arrow){
                count++;
                arrow = points[i][1];
            }
        }
        return count;
    }

    public static int Method1(int[][] points){
        Arrays.sort(points, Comparator.comparingInt(i -> i[0]));
        print(points);
        int count=1;
        int prev[] = points[0];
        for(int i=1;i<points.length;i++){
            int currStart = points[i][0];
            int currEnd   = points[i][1];

            int prevStart = prev[0];
            int prevEnd   = prev[1];

            if(currStart>prevEnd){  //No Overlap
                count++;
                prev = points[i];
            }
            else{
                prev[0] = Math.max(currStart,prevStart);
                prev[1] = Math.min(currEnd,prevEnd);                
            }
        }
        return count;
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
        //3,9],[7,12],[3,8],[6,8],[9,10],[2,9],[0,9],[3,9],[0,6],[2,8
        int points[][] = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        //print(points);
        System.out.println(Method1(points));
        System.out.println(Method2(points));
        
    }
}
