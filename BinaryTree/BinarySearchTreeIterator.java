import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeIterator {

    static class TreeNode{
        int val; TreeNode left,right;
        TreeNode(int data){ this.val = data; }
    }

static class BSTIterator {

    List<Integer> arr = new ArrayList<>();

    public void print(){
        for (Integer i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void helper(TreeNode root){
        if(root==null) return;

        helper(root.left);
        arr.add(root.val);
        helper(root.right);

    }

    public BSTIterator(TreeNode root) {
        helper(root);
    }
    
    int hasNext_IDX = -1;
    public int next() {
        ++hasNext_IDX;   
        return arr.get(hasNext_IDX);
    }
    
    public boolean hasNext() {
        ++hasNext_IDX;
        if(hasNext_IDX==arr.size()){
            return false;
        }
        else{
            hasNext_IDX--;
            return true;
        }   
    }
}
    
    public static void main(String[] args) {

        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        BSTIterator it = new BSTIterator(root);
        it.print();
                
    }
}
