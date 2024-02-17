public class PathSum{

    static class TreeNode{
        int val; TreeNode left,right;
        TreeNode(int data){ this.val = data; }
    }

    public static boolean helper(TreeNode root,int targetSum,int sum){
        if(root==null) return false;
        if(root.left==null && root.right==null && sum==targetSum){
            return true;
        }
        
        sum += root.val;
        boolean left = helper(root.left, targetSum, sum);
        boolean right = helper(root.right, targetSum, sum);
        
        return left||right;
    }

    public static boolean Method1(TreeNode root,int targetSum){
        if(root==null) return false;
        
        if(root.left==null && root.right==null && targetSum-root.val==0) return true;

        return Method1(root.left, targetSum) || Method1(root.right, targetSum);
    }

    public static void main(String[] args) {


        
    }
}