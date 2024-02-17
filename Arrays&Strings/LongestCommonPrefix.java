import java.util.Arrays;

public class LongestCommonPrefix {

    public static String Method2(String str[]){
       StringBuilder res = new StringBuilder();

       Arrays.sort(str);
       print(str);
       String first = str[0];
       String last  = str[str.length-1];
       
       for(int i=0;i<first.length();i++){
        if(first.charAt(i) != last.charAt(i)){
            break;
        }
           res.append(first.charAt(i));   
       }
       return res.toString();
    }
    
    public static String Method1(String  str[]){
        
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str);
        print(str);

        String first=str[0];
        String last=str[str.length-1];
        int i=0,j=0;
        
        while(i<first.length() && j<last.length()){
            if(first.charAt(i)!=last.charAt(j)){
                break;                
            }
            sb.append(first.charAt(i));
            i++;
            j++;
        }
        return sb.toString();        
    }

    public static void print(String str[]){
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){

        String str[] = {"aaa","aa","aaa"};
        System.out.println(Method2(str));

    }
}
