public class FactorialTrailingZeroes {

    public static int Method2(int n){
        if(n<0) return 0;
        int count=0;
        while(n>0){
            count += n/5;
            n=n/5;
            System.out.println(n);
        }   
        return count;
    }

    public static int Method1(int n){
        double fact=1.0;
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
        //System.out.println(fact);
        int ans=0;
        while(fact>0){
            if(fact%10==0){
                ans++;
            }
            fact = fact/10; 
        }
        return ans; 
    }

    public static void main(String[] args) {

        int n=25;
        System.out.println(Method2(n));
        
    }

}
