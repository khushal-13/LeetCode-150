import java.util.*;
public class AverageofLevelsinBinaryTree{

    static class TreeNode{
        int val;
        TreeNode left,right;
        public TreeNode(int data){ this.val = data; }
    }

    public static List<Double> Method2(TreeNode root){
        List<Double> ans = new ArrayList<>();
        if(root==null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            double sum=0;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr = q.remove();
                sum += curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            double levelAvg = sum/n;
            ans.add(levelAvg);
        }
        return ans;
    }

    public static List<Double> Method1(TreeNode root){
        List<Double> ans = new ArrayList<>();
        if(root==null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        double sum=0,size=0;
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    double levelAns = (double)sum/size;
                    ans.add(levelAns);                                                         
                    
                    q.add(null);
                    size=0; sum=0; //initializing for new Level
                }
            }
            else{
                sum += curr.val;
                size++;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        //for last level 
        double levelAns = (double)sum/size;
        ans.add(levelAns);   
        return ans;
    }
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(Method2(root));

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);    

    }
}