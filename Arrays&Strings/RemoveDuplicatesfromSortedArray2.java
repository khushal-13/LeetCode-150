import java.util.HashMap;

public class RemoveDuplicatesfromSortedArray2 {
    
    public static int Method1(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])<2){
                    nums[idx++] = nums[i];
                    map.put(nums[i], 2);
                }                
            }
            else{
                nums[idx++] = nums[i];
                map.put(nums[i], 1);
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        
    }
}
