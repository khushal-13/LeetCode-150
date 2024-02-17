import java.util.*;

public class SummaryRanges{

    public static List<String> Method1(int nums[]){

        List<String> list = new ArrayList<>();
        if(nums.length==1) {
            list.add(""+nums[0]);
            return list;
        }
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i+1]-1==nums[i]){
                i++;
            }
            if(start!=nums[i]){
                list.add(start+"->"+nums[i]);
            }
            else{
                list.add(""+start);
            }
        }
        return list;
    }

    public static void main(String args[]){

        int nums[] = {0,1,2,4,5,7};
        System.out.println(Method1(nums));

    }
}