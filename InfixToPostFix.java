import java.util.*;

public class InfixToPostFix {
  static int precedence(char c) {
    int[] preceed={3,2,2,1,1};
    if(c=='^'){
      return preceed[0];
    }else if(c=='/'){
      return preceed[1];
    }else if(c=='*'){
      return preceed[2];
    }else if(c=='+'){
      return preceed[3];
    }else if(c=='-'){
      return preceed[4];
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    // Main m = new Main();
    Stack<Character> st = new Stack<>();
    Scanner sc = new Scanner(System.in);
    String infix = sc.nextLine();
    // System.out.println(infix.length());
    // char[] operator = {'^','/','*','-','+'};
    char[] postfix = new char[infix.length()];
    int i = 0;
    for (char c : infix.toCharArray()) {
      if (Character.toString(c).equals("(")) {
        st.push(c);
      } else if (Character.toString(c).equals(")")) {
        while (st.peek() != '(') {
          postfix[i++] = st.pop();
        }
        st.pop();
      } else if (Character.isAlphabetic(c)) {
        postfix[i++] = c;
      } else {
        if (st.empty()) {
          st.push(c);
        } else {
          if (precedence(st.peek()) < precedence(c)) {
            st.push(c);
          } else {
            while (precedence(c) >= precedence(st.peek()) && !st.empty()) {
              postfix[i++] = st.pop();
            }
            st.push(c);
          }
        }
      }
    }
    while (!st.empty()) {
      postfix[i++] = st.pop();
    }
    String post = new String(postfix);
    System.out.println(post);
    sc.close();
  }
}