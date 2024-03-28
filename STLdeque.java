import java.util.*;
public class STLdeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(5);
        dq.addFirst(2);
        dq.addLast(10);
        while (!dq.isEmpty()) {
            System.out.println(dq.removeLast());
        }
    }
}
