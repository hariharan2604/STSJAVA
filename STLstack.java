import java.util.*;
public class STLstack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(10);
        System.out.println("Peek:" + s.peek());
        System.out.println("Search:"+s.search(2));
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
