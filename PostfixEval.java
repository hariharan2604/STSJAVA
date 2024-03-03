import java.util.*;

public class PostfixEval {
    public static void main(String[] args) {
        Deque<Character> st = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String postfix = scan.nextLine();
        for (char c : postfix.toCharArray()) {
            if (Character.isAlphabetic(c)||Character.isDigit(c)) {
                st.push(c);
            } else {
                int pop1 = st.pop();
                int pop2 = st.pop();
                if (c == '+') {
                    st.push((char) (pop2 + pop1));
                } else if (c == '-') {
                    st.push((char) (pop2 - pop1));
                } else if (c == '*') {
                    st.push((char) (pop2 * pop1));
                } else if (c == '/') {
                    st.push((char) (pop2 / pop1));
                } else {
                    st.push((char) (pop2 ^ pop1));
                }
            }
        }
        System.out.println(st.pop());
        scan.close();
    }
}
