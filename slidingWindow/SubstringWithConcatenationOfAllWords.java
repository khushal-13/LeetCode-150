import java.util.*;

public class SubstringWithConcatenationOfAllWords {

    public static List<Integer> Method2(String s, String word[]){
        
        HashMap<String,Integer> freq = new HashMap<>();
        for (String str : word) {
            freq.put(str, freq.getOrDefault(str, 0)+1);            
        }

        int eachWord = word[0].length();
        int totLen = word.length;
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<=s.length()-totLen*eachWord;i++){
            String subStr = s.substring(i, i+totLen*eachWord);
            HashMap<String,Integer> seen = new HashMap<>();
            for(int j=0;j<subStr.length();j+=eachWord){
                //int wordIndex = i+j*eachWord; 
                String curr = subStr.substring(j, j+eachWord);
                seen.put(curr, seen.getOrDefault(curr, 0)+1);
            }
            if(seen.equals(freq)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static List<Integer> Method1(String s, String word[]){

        HashMap<String,Integer> freq = new HashMap<>();
        for (String str : word) {
            freq.put(str, freq.getOrDefault(str, 0)+1);            
        }

        int eachWord = word[0].length();
        int totLen = word.length;
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<=s.length()-totLen*eachWord;i++){
            //String subStr = s.substring(i, i+totLen*eachWord);
            HashMap<String,Integer> seen = new HashMap<>();
            for(int j=0;j<totLen;j++){
                int wordIndex = i+j*eachWord; 
                String curr = s.substring(wordIndex, wordIndex+eachWord);
                if(!freq.containsKey(curr)){
                    break;
                }

                seen.put(curr, seen.getOrDefault(curr, 0)+1);

                if(seen.get(curr)>freq.getOrDefault(curr,0)){
                    break;
                }

                if(j+1==totLen){
                    ans.add(i);
                }
            }
        }
        return ans;
    }

    
    public static void main(String args[]){

        String words[] = {"foo","bar"};
        String s = "barfoothefoobarman";
        
        System.out.println(Method2(s,words));
    }
}
