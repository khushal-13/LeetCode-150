public class TrappingWater {

    public static int Method1(int arr[]){
        int n=arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(arr[i], left[i-1]);
        }

        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(arr[i], right[i+1]);
        }

        int totWater=0;
        for(int i=1;i<n-1;i++){
            int height=Math.min(left[i], right[i])-arr[i];
            totWater += height;
        }
        return totWater;
    }
    
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(Method1(arr));
    }
}
