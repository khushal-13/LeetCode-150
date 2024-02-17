public class RotateArray {

    public static void reverse(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void Method3(int nums[], int k){
        int n=nums.length;
        k=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    public static void Method2(int nums[], int k){
        int n=nums.length;
        if(n==1){
            return;
        }
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n] = nums[i]; 
        } 
        
        for(int i=0;i<n;i++){
            nums[i] = temp[i];
        }
    }

    public static void Method1(int nums[], int k){ 
        int n=nums.length;
        if(n==1){
            return;
        }
        //BRUTE FORCE
        for(int turn=1;turn<=k;turn++){
            int temp=nums[0];
            nums[0] = nums[n-1];
            for(int j=n-1;j>=2;j--){
                nums[j] = nums[j-1];
            }
            nums[1] = temp;
        }

        // SECOND TYPE
        // for(int turn=1;turn<=k;turn++){
        //     int last = nums[n-1];
        //     for(int j=n-2;j>=0;j--){
        //         nums[j+1] = nums[j];
        //     }
        //     nums[0] = last;
        // }
    }

    public static void main(String[] args) {
        
    }
}
