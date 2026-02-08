package Linked_List;
class LinkList{
    Node head;
    Node tail;
    Node next;
    int val;
    private int size;
    LinkList(){
        this.val = val;
        this.next = null;
    }
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp;
        }
        else{
           tail.next= temp;
           tail = temp;
        }
        size++;
    }
    void insert(int idx , int val) throws Error{
        if (idx == 0){
            insertAtHead(val);
            return;
        }
        if (idx == size - 1){
            insertAtTail(val);
            return;
        }
        if (idx < 0 || idx >= size){
            throw new Error("Invalid index");
        }
        else{
            Node temp = new Node(val);
            Node x = head;
            for (int i = 1; i <= idx - 1; i++) {
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
            size++;
        }
    }
    int get(int idx){
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx , int val){
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAtHead()throws Error{
        if (head == null){
            throw new Error("List is empty !!");
        }
        head = head.next;
        size--;
    }
    void delete(int idx) throws Error{
        if (idx == 0){
            deleteAtHead();
            return;
        }
        if (idx < 0 || idx >= size){
            throw new Error("Invalid index");
        }
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
        if (temp.next == tail){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;

    }
    void size(){
        System.out.print("Length of Linked list is : " + this.size);
    }
}
public class own_LL {
    public static void main(String[] args){
        LinkList list = new LinkList();
        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insert (2,25);
        list.display();
//        list.set(2,100);
//        System.out.println(list.get(2));
        list.delete(2);
        list.display();
        list.size();

    }
}
