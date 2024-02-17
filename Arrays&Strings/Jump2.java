public class Jump2 {

    static int res = 0;
    public static void jumpUtil(int nums[], int idx, int jumps){
        if(idx>=nums.length) return;
        if(idx==nums.length-1){
            res = Math.min(res, jumps);
            System.out.println(res);
            return;
        }
        for(int i=1;i<=nums[idx];i++){
            idx = idx + i;
            jumpUtil(nums, idx, jumps+1);
        }        
    }

    public static int jump(int[] nums) {
        jumpUtil(nums, 0, 0);  
        return res;              
    }

    public static int Method1(int A[]){
        int currEnd=0,currFarthest=0,jumps=0;
        for(int i=0;i<A.length-1;i++){
            currFarthest = Math.max(currFarthest, i+A[i]);
            if(i==currEnd){
                jumps++;
                currEnd = currFarthest;
            }
        }
        return jumps;
    }
    
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4,1,6,2,1,3};
        System.out.println(jump(arr));        
    }
}
