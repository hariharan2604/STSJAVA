import java.util.Scanner;
import LinkedList.LinkedList;
public class LL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int n=scanner.nextInt();
        while(n>0){
            System.out.println("Enter data: ");
            int data=scanner.nextInt();
            LinkedList.addNode(data);
            n--;
        }
        LinkedList.displayList();
        scanner.close();
    }
}
