import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void Method2Util(int start, int n, int k, List<Integer> curr, List<List<Integer>> res){

        if(k==curr.size()){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=start;i<=n;i++){
            curr.add(i);
            Method2Util(i+1, n, k, curr, res);
            curr.remove(curr.size()-1);
        }

    }

    public static List<List<Integer>> Method2(int n, int k){
        List<List<Integer>> res = new ArrayList<>();
        Method2Util(1, n, k, new ArrayList<>(),res);
        return res;
    }

    public static void Method1Util(int start, int n, int k, List<Integer> curr, List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList<>(curr));
            return;
        }                
        if(start>n){
            return;
        }

        // Ek baar liya
        curr.add(start);
        Method1Util(start+1, n, k-1, curr, res);
        //Ek baar bina liye
        curr.remove(curr.size()-1);
        Method1Util(start+1, n, k, curr, res);
    }

    public static List<List<Integer>> Method1(int n, int k){

        List<List<Integer>> res = new ArrayList<>();
        Method1Util(1, n, k, new ArrayList<>(), res);
        return res;
                
    }
    
    public static void main(String args[]){

    }
}
