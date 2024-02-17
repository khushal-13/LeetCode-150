import java.util.ArrayDeque;
import java.util.Queue;

public class Pract {
    
    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        
        System.out.println(q);

        // int lru = q.remove();
        // System.out.println(q);
    }
}
