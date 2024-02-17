public class InvertTree {

    static class Node{
        int val; Node left,right;
        public Node(int d){ this.val = d;};
    }
    
    public static Node Method1(Node root){
        //Visualize through DIAGRAM for better understanding
        if(root==null) return null;

        //Swap Upper Two Child
        Node temp = root.left;
        root.left  = root.right;
        root.right = temp;

        //call for the Swapped child 
        Method1(root.left);
        Method1(root.right);

        return root;
    }
    public static void main(String[] args) {

        Node root = new Node(0);

        root = Method1(root);
        
    }
}
