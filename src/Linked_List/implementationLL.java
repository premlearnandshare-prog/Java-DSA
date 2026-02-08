package Linked_List;

class Sll{  // User defined data type
    Node head;
    Node tail;
    int size;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void disply(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size(){
        System.out.println("Length of Linked list is : " + this.size);
    }
}

public class implementationLL {
    public static void main(String[] args){
        Sll list = new Sll();
        list.size();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        // print(list.head);
        list.disply();
        list.size();

    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

