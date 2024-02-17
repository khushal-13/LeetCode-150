import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

    public static List<List<Integer>> Method1(int arr[]){
        
        List<List<Integer>> ans = new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);list.add(arr[j]);list.add(arr[k]);
                    ans.add(list);
                    j++;
                    k--;

                    while(j<n && arr[j]==arr[j-1]) j++;
                    while(k<n && arr[k]==arr[k-1]) k--;
                }
            }
        }
        return ans;        
    }
    public static void main(String[] args) {

    //    int n=nums.length;
    //    Arrays.sort(nums);
    //     List<List<Integer>> ans = new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         if(i>0 && nums[i]==nums[i-1]) continue;
    //         int j=i+1;
    //         int k=n-1;
    //         while(j<k){
    //             int sum = nums[i]+nums[j]+nums[k];
    //             if(sum<0){
    //                 j++;
    //             }
    //             else if(sum>0){
    //                 k--;
    //             }
    //             else{ //Triplet Found
    //                 List<Integer> list = new ArrayList<>();
    //                 list.add(nums[i]); list.add(nums[j]); list.add(nums[k]);
    //                 ans.add(list);
    //                 j++;
    //                 k--;
    //                 while(j<k && nums[j]==nums[j-1]) j++;
    //                 while(j<k && nums[k]==nums[k+1]) k--;
    //             }
    //         }
    //     }
    //     return ans;

    int arr[] = {2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4};
    Method1(arr);
        
    }
}
