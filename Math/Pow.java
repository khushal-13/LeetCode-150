public class Pow {

    public static double Method2(double x, int n){
        int size=Math.abs(n);
        double ans=1;
            for(int i=1;i<=size;i++){
                ans = ans*x;
            }        
        return n>0? ans:1/ans;

        // if(n>0){
        //     double ans=1;
        //     for(int i=1;i<=n;i++){
        //         ans = ans*x;
        //     }        
        //     return ans;
        // }
        // else{
        //     double ans=1;
        //     n = Math.abs(n);
        //     for(int i=1;i<=n;i++){
        //         ans = ans*x;
        //     }        
        //     return 1/ans;
        // }
    }

    public static double Method1(double x, int n){
        double ans = Math.pow(x,n);
        return ans;
    }
    public static void main(String args[]){
        double x = 2.000;
        int n = -2;
        System.out.println(Method2(x, n));

    }
}
