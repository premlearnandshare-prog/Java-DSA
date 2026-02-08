package Linked_List;

class LinkedList{
    private Node head;
    private Node tail;
    private int size;

    void insertAttail(int val){
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insert(int idx, int val){
        if (idx == 0){
            insertAtHead(val);
            return;
        }
        if (idx == size){
            insertAttail(val);
            return;
        }
        if (idx > size || idx < 0){
            System.out.println("Invalid index");
            return;
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
    int get(int idx) throws Error{
        if (idx == size - 1) return tail.val;
        if (idx >= size || idx < 0){
            throw new Error("Invalid index!!");
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void set(int idx, int val) throws Error{
        if (idx == size - 1){
            tail.val = val;
        }
        if (idx >= size){
            throw new Error("Bhai Error");
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void size(){
        System.out.println(this.size);
    }
    void deleteAthead() throws Error{
        if (head == null){
            throw new Error("List is Empty");
        }
        head = head.next;
        size--;
    }
    void delete(int idx) throws Error{
        if (idx == 0){
            deleteAthead();
            return;
        }
        if (head == null){
            throw new Error("List is Empty");
        }
        if (idx < 0 || idx >= size){
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == tail){
            tail = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    void disply(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class ownLinkedList {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAttail(10);
        list.insertAttail(20);
        list.insertAttail(30);
        list.insertAttail(40);

//        list.size();
//        list.disply();
//
//        list.insertAttail(50);
//        list.disply();
//        list.size();
//
//        list.insertAtHead(9);
//        list.disply();
//        list.size();
//        list.insert(2,25);
//        list.disply();
////        list.insert(10,50);
//       // System.out.println(list.get(-1));
//        list.deleteAthead();
//        list.disply();
        list.delete(2);
        list.disply();
    }
}
