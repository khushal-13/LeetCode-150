public class SumRoottoLeafNumbers {
    static class TreeNode{
        int val; TreeNode left,right;
        TreeNode(int data){ this.val = data; }
    }
    
    public static int helper(TreeNode root, int res){
        //if any single left then it's right will send 0 and vice versa
        if(root==null) return 0;

        //Calculating curr sum
        res = res*10 + root.val;
        //if curr NODE is LEAF then return calculated res
        if(root.left==null && root.right==null) return res;

        //calculated left sum
        int leftSum  = helper(root.left, res);
        //calculated right sum
        int rightSum = helper(root.right, res);

        return leftSum + rightSum;
    }
    public static int Method1(TreeNode root){
        return helper(root, 0);      
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        System.out.println(Method1(root));
        
    }
}
