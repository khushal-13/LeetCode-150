public class GasStation {

    public static int Method2(int gas[], int cost[]){

        int n=cost.length;
        int totalGas=0,totalCost=0;

        for(int i=0;i<n;i++){
            totalCost += cost[i];
            totalGas += gas[i];
        }

        if(totalCost>totalGas) return -1;

        int start=0,tank=0;
        for(int i=0;i<n;i++){
            tank = gas[i] - cost[i];
            if(tank<0){
                tank=0;
                start = i+1;
            }
        }
        return start;
    }

    public static int Method1(int gas[], int cost[]){

        int n=cost.length;
        for(int i=0;i<n;i++){
            int pos=i;
            int tank=gas[pos];
            while(tank >= cost[pos]){
                tank -= cost[pos];
                pos++;
                if(pos==n){
                    pos=0;
                }
                if(pos==i){
                return pos;
                }
                tank += gas[pos];
            }
        }
        return -1;     
    }
 
    public static void main(String[] args) {

        int gas[] = {2,3,4};
        int cost[] = {3,4,3};
        System.out.println(Method1(gas, cost));
        
    }
}
