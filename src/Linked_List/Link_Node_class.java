package Linked_List;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class Link_Node_class {
    // * Array limitations *
    // 1 --> continuous memory allocation
    // 2 --> FIX and limited size
    // 3 --> insertion , deletion , without more space

//    public static void print(Node head){
//        Node temp = head;
//        while (temp != null){
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
//    }
    public static void print(Node temp){
        if (temp == null) return;  // Base case
        System.out.println(temp.val);
        print(temp.next);
    }
    public static void main(String[] args){
        // node store value and address of next node
        Node a = new Node(10);  // a is a head node
        //System.out.println(a); // a ka address print
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;  // 10->20
        b.next = c;  // 10->20->30
        c.next = d;  // 10->20->30-> 40
        d.next = e;  // 10->20->30-> 40->50

        print(a);
//        a.next = b;  // a and b are connect
//
//        System.out.println(b);
//        System.out.println(a.next);

//
//        System.out.println(a.val);
//        System.out.println(b.val);
//        System.out.println(c.val);
//        System.out.println(d.val);
//        System.out.println(e.val);
//
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(b.next.val);
//        System.out.println(c.next.val);
//        System.out.println(d.next.val);
//
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);


    }

}
