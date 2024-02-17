public class IsSubsequence {
    public static boolean Method1(String s, String t){
        int i=0,j=0;
        while(i<s.length()){
            if(j>=t.length()) break;
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i==s.length();  
    }
    public static void main(String[] args) {
        
        
    }
}
