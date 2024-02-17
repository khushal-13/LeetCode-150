import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode2{

    static class Node {
        public int val;
        public Node left,right,next;
        public Node(int _val) { val = _val;}
    }

    public static Node Method2(Node root){
        if(root==null) return null;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node prev = null;
            int n = q.size();
            
            for(int i=0;i<n;i++){
                Node curNode = q.remove();
                curNode.next = prev;
                prev = curNode;

                if(curNode.left!=null)  q.add(curNode.left);
                if(curNode.right!=null) q.add(curNode.right);
            }
        }
        return root;
    }

    public static Node Method1(Node root){
        if(root==null) return null;

        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null){
               if(q.isEmpty()) break;
               else q.add(null);
            }
            else{
                currNode.next = q.peek();
                if(currNode.left!=null)  q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
        }
        return root;        
    } 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        System.out.println(Method1(root));

    }
}