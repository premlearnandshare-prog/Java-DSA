package Linked_List;

class Linked_list{
    Node head;
    Node tail;
    int size;

    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println(this.size);
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
            tail = temp;
            return;
        }
        temp.next = head;
        head = temp;
        size++;
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
        size++;

    }
    void insert(int idx, int val) throws Error{
        if (idx == 0){
            insertAtHead(val);
            return;
        }
        else if (idx == size){
            insertAtTail(val);
            return;
        }
        else if (idx < 0 || idx > size){
            throw new Error("Invalid index");
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int get (int idx) throws Error{
        if (idx < 0 || idx >= size){
            throw new Error("Invalid index");
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val){
        if (idx < 0 || idx >= size){
            throw new Error("Invalid index");
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAtHead() throws Error{
        if (head == null){
            throw new Error("List is Empty");
        }
        else{
            head = head.next;
        }
        size--;
    }
    void deleteAtTail()throws Error{
        if (head == null){
            throw new Error("List is Empty");
        }
        if (head == tail){
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    void delete(int idx) throws Error{
        if (idx == 0){
            deleteAtHead();
        }
        if (idx == size - 1){
            deleteAtTail();
        }
        if (idx < 0 || idx > size){
            throw new Error("Invalid index");
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

}

public class Simply_Linked_list {
    public static void main(String[] args){
        Linked_list list = new Linked_list();

        list.display();
    }
}
