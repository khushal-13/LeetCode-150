public class SymmetricTree {

    static class Node{
        int val; Node left,right;
        public Node(int data){ this.val = data; }
    }

    public static boolean check(Node left, Node right){
       if(left==null && right==null) return true;
    
       if(left==null || right==null) return false;
    
       if(left.val==right.val && check(left.left,right.right) && check(left.right,right.left) ){
        return true;
       }
          
       return false;
    }
    
    public static boolean Method1(Node root){
        if(root==null) return true;
        return check(root.left,root.right);
    }
    
    public static void main(String[] args) {
        
    }
  
}