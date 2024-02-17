public class BestTimetoBuyandSellStock {

    public static int Method1(int prices[]){

        int n=prices.length;
        int profit=0;
        int maxProfit=Integer.MIN_VALUE;
        int max[] = new int[n];
        max[n-1] = prices[n-1];
        for(int i=n-2;i>=0;i--){
            max[i] = Math.max(prices[i], max[i+1]);                        
        }
        for(int i=0;i<n;i++){
            if(max[i] > prices[i]){
                profit =  max[i] - prices[i];
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        
        int prices[] = {7,1,5,3,6,4};
        System.out.println(Method1(prices));
    }
}
