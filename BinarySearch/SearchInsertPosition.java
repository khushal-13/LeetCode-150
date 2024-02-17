public class SearchInsertPosition {

    public static int Method1(int nums[], int target){
        int start=0,end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return start; 
    }
    
    public static void main(String[] args) {

        int nums[] = {1,3,5,6} , target = 2;
        System.out.println(Method1(nums, target));

        
    }
}
