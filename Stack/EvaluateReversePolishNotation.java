import java.util.*;

public class EvaluateReversePolishNotation {


    //REMEMBER "==" WIL NOT WORK USE ".equals()" METHOD
    public static int Method1(String tokens[]){
        Stack<Integer> s = new Stack<>();
        for (String i : tokens) {
            if(i.equals("+")){
                int b = s.pop(); int a = s.pop();
                int res = a+b;
                s.push(res);
            }
            else if(i.equals("-")){
                int b = s.pop(); int a = s.pop();
                int res = a-b;
                s.push(res);                
            }
            else if(i.equals("*")){
                int b = s.pop(); int a = s.pop();
                int res = a*b;
                s.push(res);
            }
            else if(i.equals("/")){
                int b = s.pop(); int a = s.pop();
                int res = a/b;
                s.push(res);
            }
            else{
                s.push(Integer.parseInt(i));
            }
        }

        return s.pop();
    }
    
    public static void main(String[] args) {

        String tokens[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(Method1(tokens));
        
    }
}
