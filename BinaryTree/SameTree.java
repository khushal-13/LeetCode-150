public class SameTree{

    static class Node{
        int val; Node left,right;
        public Node(int d){ this.val = d;};
    }

    public static boolean Method1(Node p,Node q){
        // Base case: if both trees are null, they are identical
         if (p == null && q == null) {
            return true;
        }
        // If only one tree is null 
        if (p == null || q == null) {
            return false;
        }
        // Recursively check if the left and right subtrees are identical
         if(p.val==q.val){
            return Method1(p.left, q.left) && Method1(p.right, q.right);
        }
        // The values are different
        return false;
    }

    public static void main(String[] args) {

        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        //q.left = new Node(2);
        q.right = new Node(3);

        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        System.out.println(Method1(p,q));

        
    }
}