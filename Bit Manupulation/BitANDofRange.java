public class BitANDofRange {

    public static int Method1(int left, int right){
        int ans = left & left+1;
        for(int i=left+2;i<=right;i++){
            ans = ans & i;
        }
        return ans;
    }
    
    public static void main(String[] args) {

        System.out.println(Method1(5, 7));
        System.out.println(Method1(0, 0));
        System.out.println(Method1(1, 2147483647));
        
    }
}
