import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> Method1(String str[]){

        HashMap<String,List<String>> hm = new HashMap<>();

        for(String s : str){
            char[] curr = s.toCharArray();
            Arrays.sort(curr);
            String currString = curr.toString();
            if(!hm.containsKey(currString)){
                //List<String> list = new ArrayList<>();
                // list.add(s);
                hm.put(currString, new LinkedList<String>());
            }
            //else{
                hm.get(currString).add(s);
            //}
        }
        return new LinkedList<>(hm.values());
    }
public static void main(String[] args) {

    String str[] = {"eat","tea","tan","ate","nat","bat"};
    System.out.println(Method1(str));
    
   }
}
