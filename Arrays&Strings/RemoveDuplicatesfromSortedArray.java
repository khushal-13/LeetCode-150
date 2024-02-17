import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {

    public static int Method2(int nums[]){
        int idx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[idx]==nums[i]){
                continue;
            }
            idx++;
            nums[idx] = nums[i];
        }
        return idx+1; // First is already ADDED
    }
    
    public static int Method1(int nums[]){
        int idx=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            nums[idx++] = nums[i];
            set.add(nums[i]);
        }
        return idx;
    }
    public static void main(String[] args) {
        
    }
}
