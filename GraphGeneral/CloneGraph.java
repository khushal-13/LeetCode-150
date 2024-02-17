import java.util.*;

public class CloneGraph {

    static class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

    public static Node bfs(Node node){
        if(node==null) return null;

        HashMap<Node,Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        map.put(node,new Node(node.val,new ArrayList<>()));

        while(!q.isEmpty()){
            Node curr = q.remove();

            for(int i=0;i<curr.neighbors.size();i++){
                if(!map.containsKey(curr.neighbors.get(i))){
                    q.add(curr.neighbors.get(i));
                    map.put(curr.neighbors.get(i),new Node(curr.neighbors.get(i).val,new ArrayList<>()));
                }
                map.get(curr).neighbors.add(map.get(curr.neighbors.get(i)));
            }
        }    
        return map.get(node);
    }
    
    public static Node Method1(Node node){
        HashMap<Node,Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(node);

        while(!q.isEmpty()){
            Node curr = q.poll();
            if(!map.containsKey(curr)){
                map.put(curr, new Node(curr.val, new ArrayList<>()));
                for(int i=0;i<curr.neighbors.size();i++){
                    q.add(curr.neighbors.get(i));
                }
            }
        }
        
        q.clear();
        map.clear();

        q.add(node);

        while(!q.isEmpty()){
            Node curr = q.poll();
            if(!map.containsKey(curr)){
                ArrayList<Node> list = new ArrayList<>();
                for(int i=0;i<curr.neighbors.size();i++){
                    q.add(curr.neighbors.get(i));
                    list.add(map.get(curr.neighbors.get(i)));
                }
                map.get(curr).neighbors.addAll(list);
            }
        }
        return map.get(node);
    }

    public static void print(HashMap<Node,Node> map){
        for (Map.Entry<Node,Node> mapElement : map.entrySet()) {
            Node key = mapElement.getKey();
 
            Node value = mapElement.getValue();

            System.out.println(key.val + " : " + value.val);
        }
        System.out.println();        
    }
    public static void main(String[] args) {
    
        Method1(null);
       
    }
}
