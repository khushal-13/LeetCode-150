import java.util.HashMap;

public class validAnagram{

    public static boolean Method2(String s, String t){
        
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            hm.put(curr, hm.getOrDefault(curr, 0)+1);
        }

        for(int i=0;i<t.length();i++){
            char curr = t.charAt(i);
            if(hm.containsKey(curr)){
                if(hm.get(curr)==1){
                    hm.remove(curr);
                }
                else{
                    hm.put(curr, hm.get(curr)-1);
                }
            }
            else{
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static boolean Method1(String s,String t){

        if(s.length()!=t.length()) return false;

        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        String s="rat",t="car";
        System.out.println(Method1(s, t));
        
    }
}