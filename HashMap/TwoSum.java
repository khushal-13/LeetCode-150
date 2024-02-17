import java.util.*;

public class TwoSum {

    public static int[] Method3(int nums[], int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(hm.containsKey(diff)){
                return new int[]{i,hm.get(diff)};
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }

    public static int[] Method2(int nums[], int target){
        int ans[] = new int[2];
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], i);
        }

        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(hm.containsKey(diff) && hm.get(diff)!=i){
                ans[0]=i;
                ans[1]=hm.get(diff);
                System.out.println(ans[0]+" "+ans[1]);
                return ans;
            }
        }
        return null;
    }
    
    public static int[] Method1(int nums[], int target){
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==diff){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }        
        }   
        return null;  
    }

    public static void main(String[] args) {

        int nums[] = {0,4,3,0};
        int target=0;
        Method3(nums, target);
        
    }
}
