import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest{

    public static int Method2(int nums[], int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static int Method1(int nums[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            pq.add(i);
        }
        for(int i=0;i<k-1;i++){
            pq.remove();
        }
        return pq.remove();
    }
    public static void main(String args[]){
        int nums[] = {3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(Method1(nums, k));
        System.out.println(Method2(nums, k));

    }
}