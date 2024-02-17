public class ConstructBinaryTreefromPreorderandInorderTraversal {

    static class TreeNode{
        int val; TreeNode left,right;
        public TreeNode(int d){ this.val = d;};
    }

    private static TreeNode solve(int[] preorder, int[] inorder,int start, int end, int []idx){

        if(start>end) return null;

        int rootVal = preorder[idx[0]];
        TreeNode root = new TreeNode(rootVal);
        int i;
        for(i=start;i<=end;i++){
            if(inorder[i]==rootVal) break;
        }
        idx[0]++;
        root.left  = solve(preorder,inorder,start,i-1,idx);
        root.right = solve(preorder,inorder,i+1,end,idx);
        return root;
    }
    
    public static TreeNode Method1(int[] preorder, int[] inorder) {
        int idx[] = {0};
        return solve(preorder,inorder,0,inorder.length-1,idx);   
    }

    public static void print(TreeNode root){
        if(root==null) return;

        print(root.left);
        System.out.print(root.val+" ");
        print(root.right);

    }

    public static void main(String[] args) {
        
        int preorder[] = {};
        int inorder[]  = {};

        TreeNode root = Method1(preorder,inorder);

        print(root);

    }

}
