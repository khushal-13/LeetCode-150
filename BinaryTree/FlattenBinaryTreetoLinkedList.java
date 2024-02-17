public class FlattenBinaryTreetoLinkedList {

    static class TreeNode {
        public int val;
        public TreeNode left,right;
        public TreeNode(int _val) { val = _val;}
    }

    static TreeNode prev=null;
    public static void Method1(TreeNode root){
        if(root==null) return;

        Method1(root.right);
        Method1(root.left);

        root.right = prev;
        root.left  = null;

        prev = root;                         

    }

    public static void print(TreeNode root){
        if(root==null) {
            System.out.print("null "); 
            return;
        }
        System.out.print(root.val+" ");
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(0);
        // root.left = new TreeNode(2);
        // root.right = new TreeNode(5);
        // root.left.left = new TreeNode(3);
        // root.left.right = new TreeNode(4);
        // root.right.right = new TreeNode(6);

        Method1(root);

        print(root);
        
    }
}
