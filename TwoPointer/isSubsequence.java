public class isSubsequence {

        public static boolean Method1(String s, String t) {

            int i=0,j=0;
            if(s.length()>t.length()) return false;
    
            while(i<s.length() && j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    i++;
                    j++;
                }else{
                    j++;
                }
            }
            return i==s.length();        
        }
    public static void main(String[] args) {

        String s = "axc";
        String t = "ahbgdc";
        System.out.println(Method1(s, t));
        
    }
}
