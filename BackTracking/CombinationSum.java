import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void Method1Util(int candidates[], int target,int idx, int sum, List<Integer>curr, List<List<Integer>>res){
        if(sum==target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(sum>target){
            return;
        }

        for(int i=idx;i<candidates.length;i++){
            curr.add(candidates[i]);
            sum += candidates[i];
            Method1Util(candidates, target,i, sum, curr,res);
            curr.remove(curr.size()-1);
            sum -= candidates[i];
        }

    }

    public static List<List<Integer>> Method1(int candidates[], int target){
        List<List<Integer>> res = new ArrayList<>();
        Method1Util(candidates, target,0, 0,new ArrayList<>(),res);
        return res;      
    }   

    public static void main(String[] args) {

        int candidates[] = {2,3,6,7};
        int target = 7;
        System.out.println(Method1(candidates, target));
        
    }
}
