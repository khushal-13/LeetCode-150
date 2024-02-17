import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static int[][] Method2(int [][]intervals){
        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));
        List<int[]> res = new ArrayList<>();
        int[] currInterval = intervals[0];
        res.add(currInterval);
        for (int[] j : intervals) {
            if(currInterval[1]>=j[0]){
                currInterval[1] = Math.max(currInterval[1],j[1]);
            }            
            else{
                currInterval=j;
                res.add(currInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static int[][] Method1(int [][]intervals){

        int ans[][] = new int[intervals.length][intervals[0].length];
        int ansIdx=0;

        for(int i=0;i<intervals.length;i++){
            if( i+1<intervals.length && intervals[i][1]>=intervals[i+1][0]){
                ans[ansIdx][0] = intervals[i][0];
                ans[ansIdx][1] = Math.max(ans[ansIdx][1], intervals[i+1][1]);
                ansIdx++;
                i++;
                continue;
            }
            else{
                ans[ansIdx][0] = intervals[i][0];
                ans[ansIdx][1] = intervals[i][1];
                ansIdx++;
            }
        }
        return ans;
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

        int intervals[][] = {{1,4},{4,5}};
        //int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        print(intervals);
        Method1(intervals);

        // List<List<Integer>> res = new ArrayList<>(); 
 
        // int[][] ints = res.stream().map(x -> x.stream().mapToInt(Integer::intValue).toArray()).toArray(int[][]::new); 
    
    }
}
