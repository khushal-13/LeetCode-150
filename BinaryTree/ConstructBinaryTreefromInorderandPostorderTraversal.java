public class ConstructBinaryTreefromInorderandPostorderTraversal {
 
    static class TreeNode{
        int val; TreeNode left,right;
        TreeNode(int data){ this.val = data; }
    }

    public static TreeNode solve(int inorder[], int[] postorder, int start, int end, int idx[]){
        if(start>end) return null;

        int rootVal = postorder[idx[0]];
        TreeNode root = new TreeNode(rootVal);
        int i=0;
        for(i=start;i<end;i++){
            if(inorder[i]==rootVal) break;
        }
        idx[0]--;

        root.right = solve(inorder, postorder, i+1, end, idx);
        root.left  = solve(inorder, postorder, start, i-1, idx);

        return root;
    }

    public static TreeNode Method1(int[] inorder, int[] postorder){
        int end = inorder.length-1;
        int idx[] = {end};
        return solve(inorder,postorder,0,end,idx);

    }

    public static void print(TreeNode root){
        if(root==null) return;
        
        print(root.left);
        System.out.print(root.val+" ");
        print(root.right);

    }
    public static void main(String[] args) {
        
        int inorder[] = {9,3,15,20,7};
        int postorder[]   = {9,15,7,20,3};

        TreeNode root = Method1(inorder, postorder);

        print(root);
        
    }
}
