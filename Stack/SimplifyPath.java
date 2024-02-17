import java.util.Stack;

public class SimplifyPath {
    
    public static String Method1(String path){
        String[] splitted = path.split("/");
        StringBuilder res = new StringBuilder();
        Stack<String> s = new Stack<>();

        for(int i=0;i<splitted.length;i++){
            if(!s.isEmpty() && splitted[i]==".."){
                s.pop();                
            }
            else if(!splitted[i].equals(".") && !splitted[i].equals("") && !splitted[i].equals("..")){
                s.push(splitted[i]);
            }
        }

        //Corner Case
        if(s.isEmpty()){
            return "/";
        }
       
        while(!s.isEmpty()){
            res.insert(0,s.pop()).insert(0,"/");
        }
        return res.toString();
    }
    
    public static void main(String[] args) {
        String path = "/../";
        System.out.println(Method1(path));
    }
}
