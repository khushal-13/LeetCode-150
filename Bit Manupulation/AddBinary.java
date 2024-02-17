public class AddBinary{

    public static String Method1(String a, String b){
        int alen = a.length(), blen = b.length();
        int i=0,carry=0;
        String result = "";
        //StringBuilder result = new StringBuilder();
        while(i<alen || i<blen || carry==1){
            int x=0,y=0;
            if(i<alen && a.charAt(alen-1-i)=='1') x=1;
            if(i<blen && b.charAt(blen-1-i)=='1') y=1;

            result = (x+y+carry)%2+result;
            carry  = (x+y+carry)/2;  
            i++;          

        }
        return result;
    }

    public static void main(String[] args) {
        
        String a = "11";
        String b = "1";
            
        System.out.println(Method1(a, b));

    }
}