public class IntegerToRoman {

    public static String Method1(int nums){

        int number[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String notations[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder sb = new StringBuilder();

        //USING SUBTRACTION
        // for(int i=number.length-1;i>=0;i--){
        //     if(nums==0){
        //         return sb.toString();
        //     }
        //     while(nums>=number[i]){
        //         sb.append(notations[i]);
        //         nums -= number[i];
        //     }
        // }
        // return sb.toString();   
        
        //USING DIVISION
        for(int i=number.length-1;i>=0;i--){
            if(nums==0){ return sb.toString();}
            int D=number[i],x;
            x=nums/D;
            int curr = number[i]*x;
            while(x>0){
                sb.append(notations[i]);
                x--;
            }
            nums -= curr;
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(Method1(1994));
    }
}
