public class ReverseBits {

    public static int Method1(int n){
        int result=0;
        for(int i=0;i<32;i++){
            // humne last vit nikala
            int lsb = n&1;
            //fir usko uss position pe daala jaha voh reverse hone pe hoga
            int reverse = lsb<<(31-i);
            // fir result aur reverse ka OR taaki voh digit hi sirf change ho
            result = reverse | result;
            //fir number ko aage badhaya
            n = n>>1;
        }
        return result; 
    }

    public static void print(int num[]){
        for (int i : num) {
            System.out.print(i+" ");            
        }
        System.out.println();
    }

    public static void main(String[] args) {

       //System.out.println(01%2);
       //Method1(00000010100101000001111010011100);

        
    }

}
