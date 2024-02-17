public class FindMinimuminRotatedSortedArray {

    public static int Method2(int nums[]){
        int n=nums.length;
        if(n==0) return -1;
        if(n==1) return nums[0];
        if(n==2) return Math.min(nums[0],nums[1]);

        if(nums[0]<nums[n-1]) return nums[0];
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(mid>0 && nums[mid]<nums[mid-1]) return nums[mid];

            else if(nums[mid]<nums[r]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    
    public static int Method1(int nums[]){
        int n=nums.length;
        if(n==0) return -1;
        if(n==1) return 0;
        if(n==2) return Math.min(nums[0],nums[1]);

        if(nums[0]<nums[n-1]) return 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
