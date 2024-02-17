public class MaxSubarray{

    public static int Method1(int nums[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum<0){
                sum=0;
            }
            max = Math.max(max,sum);
        } 
        if(max==0 && nums.length!=0){
            max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                max=Math.max(max,nums[i]);
            }
        }               
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Method1(nums));        
    }
}