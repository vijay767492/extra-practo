class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    } 
}
public class listt {
    
    Node head;
    // add at end 
    public void addlast(int data){
        Node newnode =new Node(data);
        if(head==null){
head=newnode;
return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void printg(){
        Node temp;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }
        System.out.println("Null");
    }
    
    public  static listt addLists(listt l1, listt l2){
        listt result = new listt();
        Node temp1 = l1.head;
        Node temp2 = l2.head;
       
        while(temp1!=null|| temp2!=null){
            int val1=0;
        int val2=0;
        
            if (temp1!=null){
                val1=temp1.data;
                temp1=temp1.next;
            }
         
            if(temp2!=null){
                val2=temp2.data;
temp2=temp2.next;
            }
           
            result.addlast(val1 + val2);
        
        }
        
        return result;


    }
    public static void main(String[] args) {
        listt l1 =new listt();
        l1.addlast(12);
        l1.addlast(63445);
        l1.printg();
        listt l2=new listt();
        l2.addlast(12);
        l2.addlast(24);
        l2.printg();

        listt hh=addLists(l1, l2);
        hh.printg();
        
    }
}
