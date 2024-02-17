import java.util.HashMap;

public class RomanInteger {

    //BRUTE FORCE BY ME
    public static int Method1(String s){
        
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int val=0;
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            System.out.println(curr);

            if(curr=='I' && i<s.length()-1){
                char next = s.charAt(i+1);
                if(next=='V'){
                    val += 4;
                    i++;
                    continue;
                }
                else if(next=='X'){
                    val += 9;
                    i++;
                    continue;
                }
            }

            if(curr=='X' && i<s.length()-1){
                char next = s.charAt(i+1);
                if(next=='L'){
                    val += 40;
                    i++;
                    continue;
                }
                else if(next=='C'){
                    val += 90;
                    i++;
                    continue;
                }
            }

            if(curr=='C' && i<s.length()-1){
                char next = s.charAt(i+1);
                if(next=='D'){
                    val += 400;
                    i++;
                    continue;
                }
                else if(next=='M'){
                    val += 900;
                    i++;
                    continue;
                }
            }
            val += hm.get(curr); 
        }
        return val;
    }

    public static int Method2(String s){

        int val=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(i<s.length()-1 && hm.get(curr)<hm.get(s.charAt(i+1))){
                val -= hm.get(s.charAt(i));
            }
            else{
                val += hm.get(s.charAt(i));
            }
        }
        return val;
    }
    
    public static void main(String[] args) {

        System.out.println(Method2("MCMXCIV"));
        
    }
}
