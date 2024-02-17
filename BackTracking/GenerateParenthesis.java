import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void helper(int open, int close, int n, StringBuilder sb,List<String> res){
        
        if(open == close && close == n){
            res.add(sb.toString());    
            return;        
        }

        if(open<n){
            sb.append("(");
            helper(open+1, close, n, sb,res);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open){
            sb.append(")");
            helper(open, close+1, n, sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        helper(0, 0, n, new StringBuilder(""),res);                   
        print(res);
        return res;
    }

    public static void print(List<String> res){
        for (String s : res) {
            System.out.print(s +" ");            
        }
        System.out.println();
    }
        
    
    public static void main(String[] args) {

        int n=3;
        generateParenthesis(n);      
        
    }
}
