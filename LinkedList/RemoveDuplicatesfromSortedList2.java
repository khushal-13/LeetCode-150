public class RemoveDuplicatesfromSortedList2 {
        
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode Method1(ListNode head){

        ListNode dummy = new ListNode(0, head),prev=dummy;

        while(head!=null){
            if(head!=null && head.val==head.next.val){
                while(head!=null && head.val==head.next.val){
                    head = head.next;                                        
                }
                //This is only linking process
                prev.next = head.next;
            }
            else{
                //This is only joining process
                prev = prev.next;
            }
            // Common to iterate over
            head = head.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        
    }
}
