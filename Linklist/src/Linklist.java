public class Linklist {
    Node head = null;
    Node tail = null;
    int count = 0;

    public static class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }

    }

    void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        count++;
    }

    void display() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }

    }

    void addatend(int data) {
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        count++;
    }

    void addatstart(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        count++;

    }

    void addatplace(int data, int place) {
        Node node = new Node(data);
        Node temp = head;
        if (place == 0) {
            addatstart(data);
        } else if (place == count) {
            addatend(data);
        }
        for (int i = 1; i < place - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }
    void deletefirst(){
        Node temp=head;
        head=temp.next;
    }
    void delete(int count){
        Node temp=head;
        for (int i = 2; i < count; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;


    }

    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(9);
        ll.addatstart(1);
        ll.addatstart(1+1);
        ll.addatend(10);
        ll.addatend(11);
        ll.addatplace(8, 8);
        ll.delete(3);
        ll.deletefirst();//321  ->  123  ->    69  ->   23  ->  14  ->  232  ->  148  ->  3  ->  1  ->  4 ->  2
        ll.display();
    }

}

