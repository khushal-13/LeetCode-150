public class SingleNumber2 {

    public static int Method1(int n[]){
        int result=0;
        for(int i=0;i<32;i++){
            int ones = 0;
            for(int j=0;j<n.length;j++){
                if((n[j]&1)!=0) ones++;
                n[j] = n[j]>>1;
            }
            int bitmask = ones%3;
            if(bitmask!=0){
                result = result | (bitmask<<i);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {

        int num[] = {0,1,0,1,0,1,99};
        System.out.println(Method1(num));
        
    }
}
