import java.util.*;

public class ZigzagConversion{

    public static void Method3(String s, int numRows){
        Vector<String> ans = new Vector<String>(numRows);
        System.out.println(ans.size());
        System.out.println(numRows);
        System.out.println(ans);
        //if(numRows==1) return s;

        boolean flag=false;
        int Lidx=1;
        for(int i=0;i<s.length();i++) {

            ans.add(Lidx,ans.get(Lidx)+s.charAt(i));

            if(Lidx==1 || Lidx==numRows)  flag = !flag;

            if(flag) Lidx++; 
            else     Lidx--;

        }
        System.out.println(ans.get(1));
        System.out.println(ans.get(2));
        System.out.println(ans.get(3));
    }

    public  static String Method2(String s, int numRows){
    
        boolean flag=false;
        @SuppressWarnings("unchecked")
        ArrayList<Character> arr[] = new ArrayList[numRows];
        for(int i=0;i<arr.length;i++){
            arr[i] = new ArrayList<>();
        }
        
        int Lidx=0;
        for(int i=0;i<s.length();i++){
            
            arr[Lidx].add(s.charAt(i));      
            
            if(Lidx==0 || Lidx==numRows-1)  flag = !flag;

            if(flag) Lidx++; 
            else     Lidx--;

        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i].toString().substring(1, 3 * arr[i].size() - 1).replaceAll(", ", ""));
        }

        return sb.toString();   

    }

    public static String Method1(String str, int rows){

        int n=str.length();
        int k=(rows-1)*2;
        StringBuilder sb = new StringBuilder(); 
        for(int i=0;i<rows;i++){
            int idx=i;
            if(i==0 || i==rows-1){
                while(idx<n){
                    sb.append(str.charAt(idx));
                    idx += (rows-1)*2;            
                }
                continue;
            }

            if(i>0 && i<rows-1){
                int j=i;
                idx=i;
                sb.append(str.charAt(i));
                while(j<n && idx<n){
                    j=idx+k-(2*i);
                    if(j<n){
                        sb.append(str.charAt(j));
                    }
                    idx += k;
                    if(idx<n){
                        sb.append(str.charAt(idx));
                    }
                }   
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        String str =  "PAYPALISHIRING";
        System.out.println(Method1(str, 4));
        System.out.println(Method2(str, 4));
        //Method3(str, 3);
       
    }
}