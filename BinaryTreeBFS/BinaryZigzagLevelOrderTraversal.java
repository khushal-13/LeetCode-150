import java.util.*;
public class BinaryZigzagLevelOrderTraversal {

    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int data){ this.val = data; }
    }

    //without using reverse 
    public static List<List<Integer>> Method3(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean flag=false;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>currLevel = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr = q.remove();
                if(flag){
                    // agar reverse karna hai toh aage ADD karo
                    currLevel.add(0,curr.val);
                }else{
                    currLevel.add(currLevel.size()-1, curr.val);
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            // if(flag){
            //     Collections.reverse(currLevel);
            // }
            res.add(currLevel);
            flag = !flag;
        }
        return res;
    }

    public static List<List<Integer>> Method2(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean flag=false;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>currLevel = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr = q.remove();
                currLevel.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(flag){
                Collections.reverse(currLevel);
            }
            res.add(currLevel);
            flag = !flag;
        }
        return res;
    }
    
    public static List<List<Integer>> Method1(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        List<Integer>currLevel = new ArrayList<>();
        boolean flag=false;
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    if(flag){
                        Collections.reverse(currLevel);
                    }
                    res.add(currLevel);
                    q.add(null);
                    flag = !flag;
                    currLevel = new ArrayList<>();
                }
            }
            else{
                currLevel.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        if(flag){
            Collections.reverse(currLevel);
        }
        res.add(currLevel);

        return res;
    }
    public static void main(String[] args) {
        
    }
}
