import java.util.*;
public class MinimumAbsoluteDifferenceinBST {

    static class TreeNode{
        int val; TreeNode left,right;
        TreeNode(int data){ this.val = data; }
    }

    static List<Integer>list = new ArrayList<>();
    public static void helper(TreeNode root){
        if(root==null) return;
    
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
    
    public static int Method1(TreeNode root){
        int ans = Integer.MAX_VALUE;
        helper(root);
        for(int i=0;i<list.size()-1;i++){
            int sum = Math.abs(list.get(i)-list.get(i+1));
            ans = Math.min(ans, sum);
        }
        return ans;
    }

    static TreeNode prev=null;
    static int ans = Integer.MAX_VALUE;
    public static void helperMethod2(TreeNode root){
        if(root==null) return;
        
        helperMethod2(root.left);
        if(prev!=null){
            int sum = Math.abs(prev.val-root.val);
            ans = Math.min(ans, sum);
        }
        prev = root;
        helperMethod2(root.right);
    }

    public static int Method2(TreeNode root){
        if(root==null) return 0;
        helperMethod2(root);                 
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(3);

        System.out.println(Method2(root));
        
    }
}
