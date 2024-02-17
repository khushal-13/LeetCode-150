import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement{

    public static int Method2(int nums[]){
        int cc=nums.length/2;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);  
            if(hm.get(nums[i])>cc){
                return nums[i];
            }          
        }
        return -1;
    }

    public static int Method1(int nums[]){
        //As we know there DEFINITELY exist a larger element it will always ocuupy the center
        Arrays.sort(nums);
        return nums[nums.length/2]; 
    }
    public static void main(String[] args) {

        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(Method1(nums));
        System.out.println(Method2(nums));
        
    }
}