public class KthSmallestElementinaBST {

    static class TreeNode{
        int val; TreeNode left,right;
        TreeNode(int data){ this.val = data; }
    }
    
    static int idx=0;
    public static TreeNode inorder(TreeNode root,int k){
        if(root==null) return null;

        inorder(root, k);
        idx++;
        if(idx==k) return root;
        inorder(root.right, k);
        return null;
    }

    public static int Method1(TreeNode root, int k){
        return inorder(root, k).val;            
    }
    public static void main(String[] args) {
        
    }
}
