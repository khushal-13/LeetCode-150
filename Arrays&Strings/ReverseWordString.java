public class ReverseWordString {

    public static String Method1(String str){

        str = str.trim();
        str = str.replaceAll("\\s+", " ");        
        String strArray[] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=strArray.length-1;i>0;i--){
            sb.append(strArray[i]+" ");
        }
        sb.append(strArray[0]);
        return sb.toString();
    }
public static void main(String[] args) {

    String str = "        a good   example   ";
    // str = str.trim();
    // System.out.println(str);
    // str = str.replaceAll("\\s+", " ");
    // System.out.println(str);

    // String strArray[] = str.split(" ");
    // for(String s : strArray){
    //     System.out.println(s);
    // }
    // System.out.println(strArray.length);

    System.out.println(Method1(str));
    
 }
}
