import java.util.*;
public class BinaryTreeLevelOrderTraversal{

    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int data){ this.val = data; }
    }

    public static List<List<Integer>> Method2(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root==null) return res;

        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr = q.remove();
                currLevel.add(curr.val);
                if(curr.left!=null)  q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            res.add(currLevel);
        }
        return res;
    }

    public static List<List<Integer>> Method1(TreeNode root){
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currLevel = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root==null) return res;

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }         
                else{
                    System.out.println(currLevel);
                    res.add(currLevel);
                    q.add(null);
                    currLevel = new ArrayList<>();
                }       
            }
            else{
                System.out.print(curr.val+" ");
                currLevel.add(curr.val);
                if(curr.left!=null)  q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        res.add(currLevel);
        return res;
    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> ans = Method1(root);
        System.out.println(ans);
        //List<List<Integer>> ans2 = Method2(root);
        //System.out.println(ans2);

    }
}