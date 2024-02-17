public class containerWithMostWater {

    public static int Method1(int height[]){
        int start=0,last=height.length-1;
        int maxWater = Integer.MIN_VALUE;

        while(start<last){
            int currHeight = Math.min(height[start], height[last]);
            int currWater = currHeight*(last-start);
            maxWater = Math.max(maxWater, currWater);

            if(height[start]<height[last]){
                start++;
            }
            else{
                last--;
            }
        }

        return maxWater;

    }
    
    public static void main(String[] args) {
        
    }
}
