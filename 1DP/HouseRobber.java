public class HouseRobber{

    //BottomUp Approach
    private static int robUtil(int nums[]){
        int n = nums.length;
        int dp[] = new int[n+1];

        // i means total amount till I'th house 

        //No house
        dp[0] = 0;

        //1 House
        dp[1] = nums[0];

        for(int i=2;i<=n;i++){
            int steal = nums[i-1] + dp[i-2];
            int skip  = dp[i-1];
            dp[i] = Math.max(steal,skip);
        }
        return dp[n];
    }

    //Recursion + Memoization
    private static int robUtil(int nums[], int i, int n, int memo[]){
        if(i>=n){
            return 0;
        }

        if(memo[i]!=0){
            return memo[i];
        }

        int steal = nums[i] + robUtil(nums, i+2, n, memo);
        int skip  = robUtil(nums, i+1, n, memo);
        return memo[i] = Math.max(steal,skip);
    }

    

    // Recursion
    public static int robUtil(int nums[], int i, int n){
        if(i>=n){
            return 0;
        }

        int steal = nums[i] + robUtil(nums, i+1, n);
        int skip  = robUtil(nums, i+1, n);
                
        return Math.max(steal, skip);
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        int memo[] = new int[n+1];
        // Recursion
        //return robUtil(nums, n, n);
        // Recursion + Memoization
        //return robUtil(nums, 0, n, memo);
        // BottomUp
        return robUtil(nums);
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,1};
        System.out.println(rob(nums));

    }
}