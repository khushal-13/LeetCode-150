import java.util.Stack;

public class ValidParenthesis{

    public static boolean Method1(String str){

        Stack<Character> st = new Stack<>();
        for (char curr : str.toCharArray()) {
            if(curr=='(' || curr=='{' || curr=='['){
                st.push(curr);
            }
            else if(curr==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else if(curr==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }
            else if(curr=='}' && !st.isEmpty() && st.peek()=='{'){
                st.pop();
            }
            else{
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {

        String str = "()[{[(])}]}{}";
        System.out.println(Method1(str));
        
    }
}