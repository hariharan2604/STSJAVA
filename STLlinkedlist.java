import java.util.*;
public class STLlinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(0, 20);
        ll.remove(2);
        int i=0;
        while (i<ll.size()) {
            System.out.println(ll.get(i));
            i++;
        }
    }
}
