import java.util.HashMap;

public class RansomNote {

    public static boolean Method2(String ransomNote, String magazine){
        int freq[] = new int[26];
        for(char c : magazine.toCharArray()){
            freq[c-'a']++;
        }

        for(char c : ransomNote.toCharArray()){
            if(freq[c-'a']==0) return false;
            freq[c-'a']--;
        }
        return true;
    }

    public static boolean Method1(String ransomNote, String magazine){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char curr = magazine.charAt(i);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char curr = ransomNote.charAt(i);
            if(hm.containsKey(curr)){
                hm.put(curr,hm.get(curr)-1);
                if(hm.get(curr)<0){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String magazine = "aab";
        String ransomNote = "aa";
        System.out.println(Method2(ransomNote, magazine));
        
    }
}
