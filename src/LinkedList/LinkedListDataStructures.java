package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size;

    int get(int idx){
        Node temp = head;
        for(int i = 1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;

    }

    void insert(int val, int idx){
        if(idx<0 || idx>size){
            System.out.println("invalid index");
        }
        else if(idx == 0) addAtHead(val);
        else if (idx==size) addAtTail(val);
        else{
            Node temp = head;
             for(int i = 1; i<=idx-1; i++){
                 temp = temp.next;

             }
             Node t = new Node(val);
             t.next = temp.next;
             temp.next = t;
             size++;
        }

    }
    
    int Search(int val){
        if(head==null) return -1;
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.val == val) return idx;
            temp = temp.next;
            idx++;

        }
        return -1;
    }

    void addAtTail(int val ){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;

        }
        size++;


    }
    void display() {
        if(head== null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

     void addAtHead(int val) {
        Node temp = new Node(val);
        if(head == null) tail = head = temp;
        else{
            temp.next = head;
            head = temp;

        }
        size++;

    }
    void deleteAtHead() {
        if(head == null) System.out.println("Node is empty");
        else{
            head = head.next;
            if(head == null) tail = null;
            size--;

        }

    }

    void delete(int idx){
        Node temp = head;
        if(idx<0 || idx>=size ){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        for(int i = 1; i<=idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx == size - 1) tail = temp;
        size--;
    }

//    void deleteAtTail() {
//        if(tail == null) System.out.println("Node is empty");
//        else{
//            head = head.next;
//
//
//
//        }
//
//    }
}


public class LinkedListDataStructures {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(5);
        ll.addAtTail(15);
        ll.addAtTail(25);
        ll.addAtTail(35);
        ll.addAtTail(45);



//        ll.addAtHead(50);
//        System.out.println(ll.size);

//        ll.display();

//        ll.deleteAtHead();
//        ll.deleteAtTail();
        ll.display();
        ll.insert(99,3);
        ll.display();
        ll.delete(1);
        ll.display();

//        ll.Search(25);


    }


}
