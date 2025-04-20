class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Add a node to the end
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Function to add two linked lists element-wise
    public static LinkedList addLists(LinkedList list1, LinkedList list2) {
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        LinkedList result = new LinkedList();

        while (temp1 != null || temp2 != null) {
            int val1 = 0;
            int val2 = 0;

            if (temp1 != null) {
                val1 = temp1.data;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                val2 = temp2.data;
                temp2 = temp2.next;
            }

            int sum = val1 + val2;
            result.addNode(sum);
        }

        return result;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class AddLinkedLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addNode(1);
        list1.addNode(2);
        list1.addNode(3);

        LinkedList list2 = new LinkedList();
        list2.addNode(1);
        list2.addNode(309);
        list2.addNode(4);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        LinkedList sumList = LinkedList.addLists(list1, list2);

        System.out.println("Result List:");
        sumList.printList();
    }
}
