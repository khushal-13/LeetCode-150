import java.util.ArrayList;
import java.util.List;

public class Permutations{

    public static void permuteUtil(int nums[], boolean[] flag, List<Integer> curr, List<List<Integer>> res){

        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(flag[i]==true) continue;

            curr.add(nums[i]);
            flag[i]=true;
            permuteUtil(nums, flag, curr, res);
            curr.remove(curr.size()-1);
            flag[i]=false;
        }
    }

    public static List<List<Integer>> Method1(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        boolean flag[] = new boolean[nums.length];        
        permuteUtil(nums,flag,new ArrayList<>(),res);

        return res;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(Method1(nums));
    }
}