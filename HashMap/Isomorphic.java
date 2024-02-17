import java.util.HashMap;

public class Isomorphic {

    public static boolean Method3(String s, String t){


        return true;
    }

    public static boolean Method2(String s, String t){
        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(hm.containsKey(curr)){
                if(hm.get(curr)==t.charAt(i)){
                    continue;
                }else{
                    return false;
                }
            }
            else{
                if(hm.containsValue(t.charAt(i))){
                    return false;
                }
                hm.put(curr, t.charAt(i));
            }
        }
        return true;
    }    

    public static boolean Method1(String s, String t){
        if(s.length() != t.length()) return false;

        //StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){

        }
        return true;
    }

    public static void main(String[] args) {

        String s="badc", t="baba";
        System.out.println(Method1(s, t));
        
    }
}
