public class validPalindrome{

    public static boolean Method2(String s){
        if(s.isEmpty()){
            return true;
        }

        int start=0,last=s.length()-1;
        while(start<=last){
            char currStart = s.charAt(start);
            char currLast = s.charAt(last);

            if(!Character.isLetterOrDigit(currStart)){
                start++;
            }
            else if(!Character.isLetterOrDigit(currLast)){
                last--;
            }
            else{
                if(Character.toLowerCase(currStart)!=Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                last--;
            } 
        }
        return true;
    }

    public static boolean Method1(String s){
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))){
                sb.append(s.charAt(i));
            }            
        }

        int l=0,r=sb.length()-1;
        while(l<=r){
            if(sb.charAt(l)!=sb.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        // System.out.println(sb);

        // for(int i=0;i<=sb.length()/2;i++){
        //     if(sb.charAt(i)!=sb.charAt(sb.length()-i-1)){
        //         return false;
        //     }
        // }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(Method2("A man, a plan, a canal: Panama"));
        
    }
}