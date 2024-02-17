import java.util.HashMap;

public class Practice {
    public static int Method1(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;

        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);

            if(curr=='I' && i!=s.length()-1){
                char next = s.charAt(i+1);
                if(next=='V'){
                    res += 4;
                    i++;
                    continue; 
                }
                else if(next=='X'){
                    res += 9;  
                    i++;
                    continue;                   
                }
                                              
            }
            else if(curr=='X' && i!=s.length()-1){
                char next = s.charAt(i+1);
                if(next=='L'){
                    res += 40;
                    i++;
                    continue; 
                }
                else if(next=='C'){
                    res += 90;   
                    i++;
                    continue;                  
                }
                continue; 
            }
            else if(curr=='C' && i!=s.length()-1){
                char next = s.charAt(i+1);
                if(next=='D'){
                    res += 400;
                    i++;
                    continue; 
                }
                else if(next=='M'){
                    res += 900;  
                    i++;
                    continue;                   
                }
                continue; 
            }
            res += map.get(curr);
        }
        return res;
    }
}
