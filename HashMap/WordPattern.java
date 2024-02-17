import java.util.HashMap;

public class WordPattern {

    public static boolean Method1(String pattern, String s){

        String strArray[] = s.split(" ");

        if(pattern.length() != strArray.length) return false;
        HashMap<Character,String> hm = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char curr = pattern.charAt(i);
            String word = strArray[i];
            if(hm.containsKey(curr)){
                if(hm.get(curr).equals(word)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                if(hm.containsValue(word)){
                    return false;
                }
                hm.put(curr,word);
            }
        }
        return true;  
    }

    public static void print(String arr[]){
        for (String k : arr) {
            System.out.print(k+" ");            
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(Method1(pattern, s));

        
    }

}
