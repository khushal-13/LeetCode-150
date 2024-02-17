import java.util.Stack;

public class MinStack {

    public static class Node{
        int data,min;
        public Node(int data, int min){
            this.data = data;
            this.min  = min;
        }
    }

    static Stack<Node> s;

    public void MinS(){
        s = new Stack<>();
    }

    public void push(int val){
        int currMin=val,currData=val;        
        if(!s.isEmpty()){
            currMin = Math.min(currMin,s.peek().min);
        }
        Node currNode = new Node(currData, currMin);
        s.push(currNode);
    }

    public void pop(){
        s.pop();
    }

    public int top(){
        return s.peek().data;
    }

    public int getMin(){
        return s.peek().min;
    }

    public void print(){
        while(!s.isEmpty()){
            System.out.println(s.pop().data);
        }
        System.out.println();
    }

    
    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.MinS();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println("Min Element : "+obj.getMin());
        obj.pop();
        System.out.println("Top Element : "+obj.top());
        System.out.println("Min Element : "+obj.getMin());
        //obj.print();
        
    }
}
