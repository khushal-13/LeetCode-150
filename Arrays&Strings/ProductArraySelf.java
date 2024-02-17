public class ProductArraySelf{

    public static void Method2(int nums[]){
        int n=nums.length;
        int res[] = new int[n];
        res[0] = nums[0];
        for(int i=1;i<n-1;i++){
            res[i] = res[i-1]*nums[i];
        }
        int prod = nums[n-1];
        res[n-1] = res[n-2];
        for(int i=n-2;i>0;i--){
            res[i] = res[i-1]*prod;
            prod *= nums[i];
        }
        res[0] = prod;
        print(res);
    }

    public static void Method1(int nums[]){
        int n=nums.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = nums[0];
        for(int i=1;i<n;i++){
            left[i] = nums[i]*left[i-1];
        }
        print(left);

        right[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = nums[i]*right[i+1];
        }
        print(right);

        int res[] = new int[n];
        res[0] = right[1];
        res[n-1] = left[n-2];
        for(int i=1;i<n-1;i++){
            res[i] = left[i-1]*right[i+1];
        }
        print(res);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4};
        Method2(nums);        
    }
}