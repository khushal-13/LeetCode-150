public class SearchRotatedSortedArray {

    public static int Method1(int nums[], int target){
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[l]){
                if(target>=nums[l] && target<=nums[mid]) r=mid-1;
                else l=mid+1;
            }
            else{
                if(target>=nums[mid] && target<=nums[r]) l=mid+1;
                else r=mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {

        int nums[] = {4,5,6,7,0,1,2}, target=3;
        System.out.println(Method1(nums, target));
        
    }
}
