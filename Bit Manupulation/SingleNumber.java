public class SingleNumber {

    public static int Method1(int num[]){

        int res=0;
        for(int i=0;i<num.length;i++){
            res = res^num[i];
        }
        return res;
    }

    public static void main(String[] args) {

        int num[] = {2,2,3,2};
        System.out.println(Method1(num));

        // int num2[] = {4,1,2,1,2};
        // System.out.println(Method1(num2));

        // int num3[] = {1};
        // System.out.println(Method1(num3));
        
    }

}
