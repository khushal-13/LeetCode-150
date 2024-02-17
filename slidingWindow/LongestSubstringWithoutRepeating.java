import java.util.*;

public class LongestSubstringWithoutRepeating {

    //HashSet
    public static int Method2(String s){
        int n=s.length();
        if(n==0 || n==1){
            return n;
        }
        int max=Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        int l=0,r=0;
        while(r<n){
            char curr = s.charAt(r);
            if(set.contains(curr)){
                while(s.charAt(l)!=curr){
                    set.remove(s.charAt(l));
                    l++;
                }       
                set.remove(s.charAt(l));
                l++;         
            }
            else{
                set.add(curr);
                max=Math.max(max,r-l+1);
                r++;
            }
        }
        return max;
    }


    //HashHMap
    public static int Method1(String s){
        int n=s.length();
        if(n==0 || n==1){
            return n;
        }
        int ans=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int start=0,end;
        for(end=0;end<s.length();end++){
            char curr = s.charAt(end);
            if(map.containsKey(curr)){
                if(start<map.get(curr)){
                    start = map.get(curr)+1;
                }
            }
            else{
                map.put(curr, end);
                ans = Math.max(ans, (end-start)+1);
                end++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    
}
}
