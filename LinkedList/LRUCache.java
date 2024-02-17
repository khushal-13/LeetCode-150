import java.util.HashMap;

public class LRUCache {

    class Node{
        int key,val;
        Node prev,next;
        public Node(int k, int v){
            this.key = k;
            this.val = v;
        }
    }

    Node head,tail;
    int cap;
    HashMap<Integer,Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        cap  = capacity;        
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if(node==null){
            return -1;
        }   
        remove(node);
        insert(node);
        return node.val;
                    
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
			remove(map.get(key));
		}
		if (map.size() == cap) {
			remove(tail.prev);
		}
		insert(new Node(key, value));
    }

    public void remove(Node curr){
        map.remove(curr.key);

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev; 
    }

    public void insert(Node curr){
        map.put(curr.key, curr);

        curr.next = head.next;
        head.next.prev = curr;
        curr.prev = head;
        head.next = curr;

    }
    
    
    public static void main(String[] args) {
        
    }
}
