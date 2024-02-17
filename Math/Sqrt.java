public class Sqrt {

    public static int Method3(int x){
        int ans=0;
        int i=1;
        while(x>=0){
            x-=i;
            i+=2;
            if(x>=0) ans++;
        }
        return ans;
    }


    public static int Method2(int x){
        int ans = (int)Math.pow(x, 0.5);
        return ans;
    }

    public static int Method1(int x){
        int ans = (int)Math.sqrt(x);
        return ans;
    }
    
    public static void main(String[] args) {

        int x=15;
        System.out.println(Method1(x));
        //System.out.println(Method2(x));
        System.out.println(Method3(x));
        
    }
}
