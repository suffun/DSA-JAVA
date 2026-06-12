package LinkedList;


class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class DisplayList {

//    public static void Display(Node head){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//
//    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        Display(a);
//        DisplayRec(a);

        System.out.println(get(a,3));

    }

    private static int get(Node head, int idx) {
        Node temp = head;
        for(int i = 1; i<=idx; i++){
            temp = temp.next;

        }
        return temp.val;
    }

//    private static void DisplayRec(Node head) {
//        if(head==null) return;
//        System.out.print(head.val+" ");
//        DisplayRec(head.next);
//
//    }
}
