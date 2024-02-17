import java.util.*;

public class MinimumWindowSubstring {

    public static String Method1(String s, String t){
        if(t.length()>s.length()) return "";
        int i=0,j=0;
        int start_i=0;
        int minWindow=Integer.MAX_VALUE;
        int requiredCount=0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int k=0;k<t.length();k++){
            map.put(t.charAt(k), map.getOrDefault(t.charAt(k), 0)+1);
        }
        requiredCount=t.length();

        while(j<s.length()){
            char currS = s.charAt(j);
            // if(map.get(currS) > 0){
            //     requiredCount--;                
            // }
            if(map.containsKey(currS) && map.get(currS)>0){
                requiredCount--;                
            }

            map.put(currS, map.getOrDefault(currS, 0)-1);

            while(requiredCount==0){
                int currWindow = j-i+1;
                if(minWindow > currWindow){
                    minWindow = currWindow;
                    start_i = i;
                }
                map.put(currS, map.getOrDefault(currS, 0)+1);
                if(map.get(currS)>0){
                    requiredCount++;
                }
                i++;
            }
            j++;
        }
        return minWindow == Integer.MAX_VALUE ? "" : s.substring(start_i, t.length()); 
    }
    
    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(Method1(s, t));
        
    }
}
