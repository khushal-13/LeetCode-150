public class Revesion {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }  

    public static ListNode leetcode82(ListNode head){
        if(head==null || head.next==null) return head;

        ListNode dummy = new ListNode(-1,head);
        ListNode prev  = dummy;
        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                while(head.val==head.next.val){
                    head = head.next;                    
                }
                prev.next = head.next;                                                
            }
            else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static ListNode leetcode61(ListNode head,int k){
        if(head==null || head.next==null) return head;

        ListNode temp = head;
        int size = 0, idx = 1;
        //Calculating SIZE
        while(temp.next!=null){
            size++;
            temp = temp.next;
        }
        size++; // As we stop at LAST NODE

        //Connecting FIRST TO LAST
        temp.next = head;

        k = k%size; 
        temp = head;
        //stoping at one earlier node
        while(idx<size-k){
            temp = temp.next;
            idx++;
        }
        ListNode ans = temp.next; //New Head 
        temp.next = null; // Unlinking the node
        return ans;   
    }


    public static ListNode leetcode2(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int dig1 = l1!=null?l1.val:0;
            int dig2 = l2!=null?l2.val:0;

            int sum = dig1+dig2+carry;
            int digit = sum%10;
            carry = sum/10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;

        }            
        return dummy.next;    
    }

    public static boolean leetcode141(ListNode head){
        if(head==null) return false;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null) {
            if(slow==fast) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
