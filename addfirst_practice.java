import java.util.*;
public class addfirst_practice {
    Node head;
    class Node{
        String data;
        Node next;
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
        }
        
        public void addFirst(String data){
            Node newnode=new Node(data);
            if(head==null){
               head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public void addLast(String data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            Node currentnode=head;
            while(currentnode.next!=null){
                currentnode=currentnode.next;
            }
currentnode.next=newnode;

        }
       
public void printList(){
    if(head==null){
        System.out.println("linked list is empty");
        return;
    }
    Node current=head;
while(current!=null){
    System.out.print(current.data+"->");
    current=current.next;
}

System.out.println("Null");
}

public static void main(String[] args) {
    addfirst_practice ff=new addfirst_practice();
    ff.addFirst("vijay");
    ff.addFirst("bikshapthi");
    ff.addFirst("prammela");
    ff.addFirst("akka");
    ff.addLast("22222");
    ff.printList();
}
}
