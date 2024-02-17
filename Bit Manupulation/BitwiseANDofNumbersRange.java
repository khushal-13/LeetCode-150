public class BitwiseANDofNumbersRange {

    public static int Method2(int left, int right){
        // We will right shift until all bits become equal i.e left == right
        // Because Only that common number will be present until last
        // any bit containing 0 will make that bit completely 0 until last digit

        int count=0;
        //creating count so that we make that much 0 on the right side i.e by shifting left
        while(left!=right){
            left >>= 1;
            right >>= 1;
            count++;
        }
        // left and right have the common bit NOW 
        // count has the No. of 0's to be added
        //shifted left to get the common bit
        return left<<=count;
    }

    public static int Method1(int left, int right){
        //This traverse every digit in that range 
        // O(n)
        int ans = left & (left+1);
        for(int i=left+2;i<=right;i++){
            ans = ans & i;
        }        
        return ans;
    }
    
    public static void main(String args[]){

        System.out.println(Method1(5, 7));

    }
}
