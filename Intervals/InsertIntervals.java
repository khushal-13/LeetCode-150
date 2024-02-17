import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {

    public static int[][] Method2(int [][] intervals, int[] newInterval){
        List<int[]> res = new ArrayList<>();
        boolean flag=false;
        int[] currInterval = newInterval;
        //res.add(currInterval);
        for (int[] j : intervals) {
            if(currInterval[1]>=j[0]){
                currInterval[1] = Math.max(currInterval[1],j[1]);
                flag=true;
            }            
            else{
                if(flag==false) {
                    res.add(j);
                    continue;
                }
                currInterval=j;
                res.add(currInterval);
            }
        }   
        return null; 
    }

    public static int[][] Method1(int[][] intervals, int[] newInterval) { 
        
        List<int[]> res = new ArrayList<>();
        boolean flag=false;
        //int currInterval[] = newInterval;
        for (int[] i : intervals) {
            if(i[1]>=newInterval[0]){
                //System.out.println(i[0]+" "+newInterval[1]);
                i[1] = Math.max(i[1], newInterval[1]);
                newInterval = i;
                res.add(i);
                //System.out.println(newInterval[0]+", "+newInterval[1]);
                flag=true;
            }            
            else{
                if(flag==false) {
                    res.add(i);
                    continue;
                }
                res.add(i);
                newInterval = i;
            }
        }    
        return res.toArray(new int[res.size()][]);    
    }

    public static int[][] Method3(int intervals[][], int newInterval[]){
        List<int[]> res = new ArrayList<>();
        for(int[] in:intervals){
            if(in[1]<newInterval[0]){
                res.add(in);
            }
            else if(newInterval[1]<in[0]){
                res.add(newInterval);
                newInterval = in;
            }
            else{
                newInterval[0] = Math.min(in[0], newInterval[0]);
                newInterval[1] = Math.max(in[1], newInterval[1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
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
    
    public static void main(String args[]){

        //1,2],[3,5],[6,7],[8,10],[12,16
        int [][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int []newInterval = {4,8};
        print(intervals);
        int [][]ans = Method3(intervals, newInterval);
        print(ans);
    
    }
}
