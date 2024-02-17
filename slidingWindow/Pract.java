public class Pract {

    public static long maximumTriplet2(int nums[]){
        int max = 0;
        int n = nums.length;
        int maxRight[] = new int[n];
        for(int i=n-1;i>=2;i--){
            max = Math.max(nums[i],max);
            maxRight[i] = max;
        }

        int maxDiff[] = new int[n];
        max = nums[0];
        for(int i=1;i<n-1;i++){
            max = Math.max(max,nums[i]);
            maxDiff[i] = max-nums[i];                        
        }

        long ans=0;
        for(int i=1;i<n-1;i++){
            long curr = 1l*maxDiff[i]*maxRight[i+1];
            ans = Math.max(curr, ans);            
        }
        return ans;
    }

    public static long maximumTriplet(long nums[]){
        long max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    //System.out.println(i +" "+j+" "+k);
                    long curr = (long)(nums[i]-nums[j])*nums[k];
                    //System.out.println(curr);
                    if(curr > max){
                        max = curr;
                    }
                }
            }
        }
        return max;  
    }

    public static long maximumTripletValue(int[] A) {
        long res = 0, maxa = 0, maxab = 0;
        for (int a : A) {
            res = Math.max(res, 1L * maxab * a);
            maxab = Math.max(maxab, maxa - a);
            maxa = Math.max(maxa, a);
            System.out.println(res+" "+maxab+" "+maxa);
        }
        return res;
    }
    
    public static void main(String[] args) {

    int nums[] = {12,6,1,2,7};
    //System.out.println((nums[0]-nums[1])*nums[2]);

    //System.out.println(maximumTriplet2(nums));

    System.out.println(maximumTripletValue(nums));
        
    }
}
