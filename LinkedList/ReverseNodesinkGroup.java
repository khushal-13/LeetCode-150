public class ReverseNodesinkGroup {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static void Method1(ListNode head){

    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode curr = head;
        int count=0;
        // Ye line mein problem hai .next daala toh hi sahi COUNT deta hai
        // Magar VS CODE mein vaise bhi sahi deta hai
        while(curr!=null){
            curr=curr.next;
            count++;
        }        
        System.out.println(count);       
        
    }
}
