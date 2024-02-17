public class ValidPalindrome {

    public static boolean Method1(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        int start=0, end=sb.length()-1;
        while (start<end) {
            if(sb.charAt(start)!=sb.charAt(end)){
                return false;
            }            
        }   
        return true; 
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Method1(s);
    }
}
