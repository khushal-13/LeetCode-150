public class PositionOfElement {

    public static int[] Method2(int nums[], int target){
        int ans[] = {-1,-1};
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                int first=mid-1,last=mid+1;
                while(first>=0 && nums[first]==target) first--;
                ans[0] = first+1;

                while(last<nums.length && nums[last]==target) last++;
                ans[1] = last-1;
                return ans;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }

    public static int[] Method1(int nums[], int target){
        int ans[] = {-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans[0] = i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
           if(nums[i]==target){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

    public static void print(int nums[]){
        for (int i : nums) {
            System.out.print(i+" ");            
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

    int nums[] = {5,7,7,8,8,10};
    Method2(nums, 6);
        
    }
}
