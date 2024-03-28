import java.util.*;
public class STLqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek:" + q.peek());
        System.out.println("Size:"+q.size());
        
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
