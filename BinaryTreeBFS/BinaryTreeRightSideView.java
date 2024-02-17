import java.util.*;
public class BinaryTreeRightSideView {

    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int data){ this.val = data; }
    }
    
    public static List<Integer> Method1(TreeNode root){
        List<Integer>res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr = q.remove();
                if(i==(n-1)) res.add(curr.val);        

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }            
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
