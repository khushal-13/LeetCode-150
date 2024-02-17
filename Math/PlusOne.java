import java.util.*;
// import java.util.List;

public class PlusOne {

    public static int[] Method2(int digits[]){
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                print(digits);
                return digits;
            }
        }
        int ans[] = new int[n+1];
        ans[0]=1;
        print(ans);
        return ans;         
    }

    public static int[] Method1(int digits[]){
        int n=digits.length;
        if(n==0) return digits;
        if(digits[n-1]>=0 && digits[n-1]<=8){
            digits[n-1]++;
            print(digits);
            return digits;
        }

        int pos=n-1;
        while(pos>=0 && digits[pos]==9){
            digits[pos]=0;
            pos--;
        }
        if(pos<0){
            int ans[] = new int[n+1];
            ans[0] = 1;
            print(ans);
            return ans;
        }
        else{
            digits[pos]++;
            return digits;
        }
    }

    public static int[] plusOne(int digits[]) {
        if(digits.length==0) return new int[0];

        Integer num=0;
        for(int i=0;i<digits.length;i++){
            num = (num*10) + digits[i];
            System.out.print(num +" ");
        }
        System.out.println();
        num = num+1;
        System.out.println(num);

        ArrayList<Integer> ans = new ArrayList<>();
        while(num!=0){
            ans.add(0,num%10);
            num = num/10;
        }
        int res[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        } 
        print(res);
        return res;
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int num[] = {8,9,9,9};
        Method2(num);
        //plusOne(num);
    
    }
}
