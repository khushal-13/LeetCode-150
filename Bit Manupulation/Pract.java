import java.util.Stack;

class Pract {

    int min = Integer.MAX_VALUE;
    Stack<Integer> s;

    public Pract() {
        s = new Stack<>();                 
    }
    
    public void push(int val) {
        min = Math.min(min,val);
        s.push(val);        
    }
    
    public void pop() {
        s.pop();        
    }
    
    public int top() {
        return (Integer)s.peek();        
    }
    
    public int getMin() {
        return min;        
    }

    public static void main(String args[]){

        Pract obj = new Pract();
        obj.push(20);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }
}