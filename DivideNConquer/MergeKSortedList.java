public class MergeKSortedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }
    
    //  MERGE FUNCTION DO TYPE KE 

    // METHOD 1 of Merge

    // private ListNode merge(ListNode l1, ListNode l2) {
    //     ListNode head = new ListNode();
    //     ListNode temp = head;
    //     while (l1 != null && l2 != null) {
    //         if (l1.val <= l2.val) {
    //             temp.next = l1;
    //             l1 = l1.next;
    //         } else {
    //             temp.next = l2;
    //             l2 = l2.next;
    //         }
    //         temp = temp.next;
    //     }

    //     if (l1 != null) {
    //         temp.next = l1;
    //     } else {
    //         temp.next = l2;
    //     }
    //     return head.next;
    // }

    // METHOD 2 of Merge
    private ListNode merge(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;

        if(l1.val<=l2.val){
            l1.next = merge(l1.next, l2);
        }
        else{
            l2.next = merge(l1, l2.next);
        }
        return null;
    }

    private ListNode partition(ListNode []lists, int start, int end){
        if(start>end) return null;

        if(start==end) return lists[start];

        int mid = start + (end - start)/2;
        ListNode l1 = partition(lists, start, mid);
        ListNode l2 = partition(lists, mid+1, end);

        return merge(l1, l2);
    }

    private ListNode mergeKLists(ListNode [] lists){
        int k = lists.length;
        if(k==0) return null;

        return partition(lists, 0, k-1);
    }

    public static void main(String[] args) {

        MergeKSortedList obj = new MergeKSortedList();
        obj.mergeKLists(null);
        
    }
}
