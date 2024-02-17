public class ConvertSortedArraytoBinarySearchTree {
        static  class TreeNode {
        int val;
        TreeNode left,right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static TreeNode helper(int nums[], int left, int right){

        if(right>left) return null;

        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left  = helper(nums,left,mid-1);
        root.right = helper(nums, mid+1, right);
        return root;
    } 

    public static TreeNode Method1(int nums[]){
        if(nums.length==0) return null;
        return helper(nums, 0, nums.length-1);
    }
    public static void main(String[] args) {
        
    }
}
