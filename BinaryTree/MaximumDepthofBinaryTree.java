public class MaximumDepthofBinaryTree{

    static class Node{
        int val; Node left,right;
        public Node(int d){ this.val = d;};
    }

    public static int Method1(Node root){
        if(root==null) return 0;

        int lh = Method1(root.left);
        int rh = Method1(root.right);

        return Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
        
    }
}