import java.util.HashMap;

public class RemoveElement2{

    public static int Method2(int nums[]){
        int index=0;
        for(int n : nums){
            if(index<2 || n>nums[index-2]){
                nums[index++] = n;
            }
        }
        return index;
    }

    public static int Method1(int nums[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int index=0;

        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            if(hm.containsKey(curr)){
                if(hm.get(curr)<2){
                    hm.put(curr,2);
                    nums[index++] = curr;
                }
            }
            else{
                hm.put(curr,1);
                nums[index++] = curr;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        
    }
}