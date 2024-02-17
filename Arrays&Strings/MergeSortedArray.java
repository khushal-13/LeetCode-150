import java.util.Arrays;

public class MergeSortedArray {

    public static void Method2(int nums1[], int nums2[], int m, int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while (j>=0) {
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }            
            else{
                nums1[k--] = nums2[j--];
            }
        }
        print(nums1);
    }
    
    public static void Method1(int nums1[], int nums2[], int m, int n){
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        //Method1(nums1, nums2, 3, 3);
        Method2(nums1, nums2, 3, 3);
        
    }
}
