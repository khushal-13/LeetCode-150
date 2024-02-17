//import java.util.Arrays;

public class MinimumSubarray{

    public static int Method1(int nums[], int target){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum += nums[k];
                }
                if(sum==target){
                    //System.out.print(i+" ");
                    //System.out.println(j-i+1);
                    ans = Math.min(ans, (j-i))+1;
                }
            }
        }
        if(ans>nums.length){
            return 0;
        }
        return ans;
    }
    public static void main(String[] args) {

        int nums[] = {1,1,1,1,1,1,1,1};
        int target = 11;
        System.out.println(Method1(nums, target));
        
    }
}