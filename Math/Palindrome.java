public class Palindrome{

    public static boolean Method1(int x){
        int curr=x;
        if(x<0 || (x!=0 && x%10==0)) return false;
        int num=0;
        while(x>0){
            num = num*10 + x%10;
            x=x/10;
        }       
        System.out.println(x);
        return num==curr; 
    }

    public static void main(String args[]){
        int x=123;
        System.out.println(Method1(x));
        
    }
}