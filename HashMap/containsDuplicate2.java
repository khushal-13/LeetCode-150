import java.util.HashMap;

public class containsDuplicate2 {

    public static boolean Method1(int nums[], int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int diff = Math.abs(hm.get(nums[i])-i);
                if(diff<=k){
                    return true;
                }
                else{
                    hm.put(nums[i],i);
                }
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return false;    
    }
    
    public static void main(String[] args) {

        int nums[] = {1,2,3,1}, k=3;
        System.out.println(Method1(nums, k));
        
    }
}
