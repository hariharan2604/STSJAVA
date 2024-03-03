package LinkedList;

public class LinkedList {
    public static Node head=null;
    public static Node temp=head;
    public static void displayList(){
        Node temp=head;
        System.out.println("The Linked List: ");
        while(temp.next!=null){
            System.out.println(temp.element);
            temp=temp.next;
        }
        System.out.println(temp.element);
    }
    public static void addNode(int element){
        Node newNode=new Node(element);
        if(head==null){
            head=newNode;
            temp=head;
        }
        else{
            temp.next=newNode;
            temp=newNode;
        }

    }
}

class Node {
    public  int element;
    public Node next;

    Node(int data){
        this.element=data;
        this.next=null;
    }
}
