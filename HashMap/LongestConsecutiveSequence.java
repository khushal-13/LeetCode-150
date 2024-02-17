import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int Method2(int nums[]){
        int lastSmallest=Integer.MIN_VALUE;
        int count=0,ans=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastSmallest){
                count++;
                lastSmallest = nums[i];
            }
            else if(nums[i] != lastSmallest){
                count=1;
                lastSmallest = nums[i];
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }

    public static int Method1(int nums[]){
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i-1]==nums[i]) continue;
            int start=i;
            while(i+1<nums.length && nums[i+1]-1==nums[i]){
                i++;
            }
            if(start<i){
                ans = Math.max(i-start+1, ans);
            }
            else{
                ans = Math.max(ans, 1);
            }
        }
        return ans;

        // int ans=0;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     int count=1;
        //     while((Arrays.binarySearch(nums, 0, nums.length, nums[i]+count))>=0){
        //         count++;
        //     }
        //     ans = Math.max(ans,count);
        // }
        // return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        System.out.println(Method2(nums));
        
    }
}
