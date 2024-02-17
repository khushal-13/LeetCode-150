public class PeakElement {

    // log(n)
    public static int Method2(int nums[]){
        int n=nums.length;
        int l=0,r=n-1;
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid]>nums[mid+1]){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;    
    }

    // O(n)
    public static int Method1(int nums[]){
        int n=nums.length;

        if(n==0 || n==1) return 0;

        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        
        for(int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) return i;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        
    }
}
