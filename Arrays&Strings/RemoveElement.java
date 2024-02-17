public class RemoveElement{

    public static int Method1(int nums[], int val){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        } 
        return index;         
    }

    public static int Method2(int nums[], int val){
        int temp[] = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            temp[k] = nums[i];
            k++;
        }
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }    
        return temp.length;
    }

    public static void main(String args[]){

    }
}