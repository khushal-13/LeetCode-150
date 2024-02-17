public class BestTimetoBuyandSellStock2 {

    public static int Method1(int prices[]) {
        int total = 0;
        for(int i=0;i<prices.length;i++){
            int buyIdx = i;
            while (i<prices.length-1 && prices[i]<prices[i+1]) {
                i++;                
            }
            int sellIdx = i;
            int profit = prices[sellIdx] - prices[buyIdx];
            total += profit;
        }
        return total;
    }

    public static void main(String[] args) {

    }
}
