package DLL;
class Node {
    int data ;
    Node next;
    Node prev;
    public Node(int data){
        this.data= data;
    }
}

public class DoublyLL {
    Node head ;
    Node tail;
    int count;

//Insertion Operations

    void insertatbegin(int data){
        Node node = new Node(data);
        if(head ==null){
            head = node;
            tail = node;
            count++;
        }
        else {
            node.next = head;
            head.prev = node;
            head= node;
            count++;
        }
    }
    void insertatend(int data){
        Node node = new Node(data);
        if( tail == null){
            head= node;
            tail = node ;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            count++;
        }
    }
    void insertionbefore(Node targetnode,int data){
        Node node = new Node(data);
        Node temp = targetnode;
        temp.prev.next=node;
        node.prev=temp.prev;
        node.next=temp;
        temp.prev=node;
        count++;
    }
    void insertionafter(Node targetnode, int data){
        Node node = new Node(data);
        Node temp= targetnode;
        node.prev= temp;
        node.next= temp.next;
        temp.next.prev= node;
        temp.next= node;
        count++;
    }

//Deletion Operations

    void deletestart(){
        Node temp ;
        head = head.next;


    }
    void deleteend(){
        tail= tail.prev;

    }
    void delete(int count){

    }

//Traversal
    void printforward(){
        Node temp = head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=null);


    }
    void printreverse(){
        Node temp= tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.prev;
        }

    }

//Search

    void search(int data){


    }

//Update a  node

    void update(Node node , int data){

    }

//Reverse a Doubly Linked List(swap prev to next)
    void reverse(){
        Node temp1 = head;
        Node temp2;
        head = tail;
        tail=temp1;

        while(temp1.next!=null ){
            temp1.prev= temp1.next;
        }

    }
    void print(){
        Node temp = head;
        do{

            System.out.println(temp.data);
            temp= temp.next;
        }while(temp!=null);

    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertatend(29);
        dll.insertatbegin(30);

        dll.insertatbegin(31);
        dll.insertatbegin(32);
        //dll.print();
       // dll.printreverse();
       // dll.printforward();
        dll.insertionafter(dll.head.next.next, 99);
        dll.deletestart();
        dll.print();
    }


}
