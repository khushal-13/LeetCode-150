import java.util.Arrays;

public class twoSum2 {

    public static void Method2(int numbers[], int target){
        int i=0,j=numbers.length-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum>target){
                i++;
            }
            else if(sum<0){
                j--;
            }
            else{
                int ans[] = new int[2];
                ans[0] = i+1;
                ans[1] = j+1;
                return;
            }
        }

    }

    public static void Method1(int num[], int target){

        int ans[] = new int[2];

        for(int i=0;i<num.length-1;i++){
            ans[0] = i+1;
            int secondNo = target-num[i];
            //System.out.println(secondNo);
            int idx = Arrays.binarySearch(num, i+1, num.length, secondNo);
            if(idx>=0){
                System.out.println(i+1);
                System.out.print(idx+1);
                ans[1] = idx+1;
            }
        }
        //System.out.println(ans[0]+" "+ans[1]);        
    }
    
    public static void main(String[] args) {

        int arr[] = {2,3,4};
        //System.out.println(Arrays.binarySearch(arr, 1, arr.length, 4));
        Method2(arr, 6);

        
    }
}
