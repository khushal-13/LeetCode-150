import java.util.*;

public class PhoneNumber{

    public static void letterCombinationsUtil(String digits,HashMap<Character,String> hm, List<String> list,int idx, StringBuilder sb){

        if(idx==digits.length()){
            list.add(sb.toString());
            return;
        }

        String curr = hm.get(digits.charAt(idx));
        for(int i=0;i<curr.length();i++){
            sb.append(curr.charAt(i));
            letterCombinationsUtil(digits, hm, list, idx+1, sb);   
            sb.deleteCharAt(sb.length()-1);         
        }

    }

    public static List<String> Method1(String digits){

        List<String> list = new ArrayList<>();

        if(digits.length()==0) return list;

        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        letterCombinationsUtil(digits,hm,list,0,new StringBuilder());
        
        return list;
    }
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(Method1(digits));
    }
}