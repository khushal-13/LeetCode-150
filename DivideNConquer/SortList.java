public class SortList{

    static class Node{
        int data; Node next;
        public Node(int d){ this.data = d;}
        public Node(int d,Node n){ this.data = d; this.next = n;}
    }

    public static Node findMid(Node head){
        // Node slow=head,fast=head.next;
        // while(fast!=null && fast.next!=null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // //First Half Last Node = slow
        // return slow;

        Node slow=head,fast=head,temp=null;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return temp;
    }

    public static Node mergeSort(Node h1,Node h2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(h1!=null && h2!=null){
            if(h1.data<=h2.data){
                temp.next = h1;
                temp = temp.next;
                h1 = h1.next;
            }
            else{
                temp.next = h2;
                temp = temp.next;
                h2 = h2.next;
            }
        }

        while(h1!=null){
            temp.next = h1;
            temp = temp.next;
            h1 = h1.next;
        }
        while(h2!=null){
            temp.next = h2;
            temp = temp.next;
            h2 = h2.next;
        }
        return dummy.next;
    }

    public static Node merge(Node head){
        if(head==null || head.next==null) return head;

        Node mid = findMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft  = merge(head);
        Node newRight = merge(rightHead);

        return mergeSort(newLeft,newRight);

    }

    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = new Node(8);

        print(head);
        System.out.println(findMid(head).data);

        // print(head);

        // head = merge(head);

        // print(head);

        
    }
}