public class HappyNumber {

    public static boolean Method1(int n){
        while(n!=1 && n>0){
            int sum=0;
            while(n>0){
                int lastDigit = n%10;
                int square = lastDigit*lastDigit;
                sum += square;
                n=n/10;
            }
            n=sum;
        }
        return true;
    }
    public static void main(String[] args) {

        int n=2;
        System.out.println(Method1(n));
        
    }
}
