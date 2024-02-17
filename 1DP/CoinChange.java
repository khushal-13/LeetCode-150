import java.util.ArrayList;
import java.util.List;

public class CoinChange {


    static int res=-1;
    //DFS
    public static void DFSUtil(int coins[], int amount, int start, int end, ArrayList<Integer> list){
        if(start>end || amount<0){
            return;
        } 

        if(amount==0){
            int curr = list.size();
            res = Math.min(res, curr);
        }

        for(int i=start;i<end;i++){
            amount -= coins[i];
            list.add(coins[i]);
            DFSUtil(coins, amount, start+1, end, list);
        }
    }

    public static int DFS(int coins[], int amount){
        DFSUtil(coins, amount, 0, coins.length, new ArrayList<>());
        return res;
    }
    

    // This is Greedy Approach (But is WRONG) : Test_Case -> {1,5,6,9} amt=11
    //Greedy ans = 9,1,1 (3 coins) BUT 6,5 (2 coins) is correct answer
    public static int coinChange(int[] coins, int amount) {
        int total=0;
        for(int i=coins.length-1;i>=0;i--){
            while(amount>=coins[i]){
                amount -= coins[i];
                total++;
            }
        }
        if(amount==0){
            return total;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int amount = 15;
        System.out.println(DFS(coins, amount));
    }
}
