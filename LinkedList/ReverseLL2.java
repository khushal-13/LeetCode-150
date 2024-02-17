public class ReverseLL2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseLL(ListNode head){
        ListNode prev=null,curr=head,nxt=head;

        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        
        return head;
    }

    public static ListNode revBetweenMethod2(ListNode head, int left, int right){

        // See Nikhil Lohia YOUTUBE video on REVERSE LL 2

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftPre=dummy,curr=head;
        for(int i=0;i<left-1;i++){
            leftPre =  leftPre.next; 
            curr = curr.next;                    
        }
  
        
        ListNode prev=null,nxtNode;

        ListNode rightPrev = curr;//Use to link 

        for(int i=1;i<=right-left+1;i++){
            nxtNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxtNode;
        }


        //Last linking process
        leftPre.next = prev;
        rightPrev.next = curr;

        return dummy.next;

    }



    public static ListNode revBetweenMethod1(ListNode head, int left, int right){
        ListNode prev,curr,dummyNode = new ListNode(0);
        prev=dummyNode;
        dummyNode.next = head;
        for(int i=1;i<left;i++){
            prev = prev.next;
        }

        curr = prev.next;
        for(int i=1;i<=right-left;i++){
            ListNode temp = prev.next;
            prev.next = curr.next;
            curr.next = prev.next.next;
            prev.next.next = temp;
        }  

        return dummyNode.next;
    }

    public static void print(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        ListNode ll = new ListNode(10);
        ll.next = new ListNode(20);
        ll.next.next = new ListNode(30);
        ll.next.next.next = new ListNode(40);
        ll.next.next.next.next = new ListNode(50);

        print(ll);

        ListNode head = revBetweenMethod2(ll,2,4);


        print(head);

    }
}
