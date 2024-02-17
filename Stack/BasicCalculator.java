import java.util.Stack;

public class BasicCalculator {
    
    public static int Method1(String s){
        int n=s.length();
        int res=0,num=0,sign=1;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            char curr = s.charAt(i);

            if(Character.isDigit(curr)){
                num = num*10 + (int)(curr-'0');                                
            }
            else if(curr=='+'){
                res += (num*sign);
                num = 0;
                sign = 1;
            }
            else if(curr=='-'){
                res += (num*sign);
                num = 0;
                sign = -1;
            }
            else if(curr=='('){
                st.push(res);
                st.push(sign);
                num = 0; 
                res = 0;
                sign = 1;
            }
            else if(curr==')'){
                res += (num*sign);
                num = 0;

                int lastSign = st.pop();
                int lastResult = st.pop();

                res *= lastSign;
                res += lastResult;
            }
        }
        res += (num*sign);
        return res;        
    }

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(Method1(s));
    }
}
