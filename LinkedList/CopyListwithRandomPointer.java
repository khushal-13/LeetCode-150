import java.util.HashMap;

public class CopyListwithRandomPointer {

    static class Node {
        int val;
        Node next; Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }    
    
    public static Node Method1(Node head){
        if(head==null) return head;
        Node curr=head,newHead=null,prev=null;
        HashMap<Node,Node> map = new HashMap<>();
        while(curr!=null){
            Node temp = new Node(curr.val);
            map.put(curr, temp);
            if(newHead==null){
                newHead = temp;
                prev    = temp;                
            }
            else{
                prev.next = temp;
                prev      = temp;
            }
            curr = curr.next;
        }        

        Node newCurr = newHead;
        curr = head;
        while(curr!=null){
            if(curr.random==null){
                newCurr.random = null;
            }
            else{
                newCurr.random = map.get(curr.random);
            }
            curr    = curr.next;
            newCurr = newCurr.next;
        }
        return newHead;
    }
    
    public static void main(String[] args) {
        
    }
}
