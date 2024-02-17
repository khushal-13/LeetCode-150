public class NumberOfOneBits {

    public static int Method2(int n){
        int count=0;
        int bitmask=1;
        for(int i=0;i<32;i++){
            bitmask = 1<<i;
            if((n&bitmask)!=0) count++;
        }
        return count;
    }

    public static int Method1(int n){
        int ones = 0;
    	while(n!=0) {
    		// ones = ones + (n & 1);
            if((n&1)!=0) ones++;
    		n = n>>>1;        // 3 arrow 
    	}
    	return ones;
    }
    
    public static void main(String[] args) {

        //int n = 11111111111111111111111111111101;
        
    }
}
