public class MaximumSumCircularSubarray {

    public static int Method1(int nums[]){

        int res = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int sum = kadane1(nums);
            System.out.println(sum);
            res = Math.max(res,sum);
            rotate1(nums);
            print(nums);
            
        }
        return res;
    }

    private static int kadane1(int nums[]){

        if(nums.length==0){
            return 0;
        }

        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum<0){ sum = 0;}
            max = Math.max(sum,max);
        }

        if(max==0){
            max = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                max = Math.max(max,nums[i]);
            }
        }
        return max;
    }

    private static void rotate1(int arr[]){
        int last = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = last;
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {5,-3,5};
        System.out.println(Method1(nums));
    }
}