public class Listbasic {
    public static class Node{
        int data;
        Node next = null;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node node1 = new Node(23);
        Node node2 = new Node(12);
        node1.next = node2;
        System.out.println(node2.next);
        System.out.println(node1.next);
        System.out.println(node1.data);
        System.out.println(node2.data);
        //Listbasic$Node@6acbcfc0
    }
}
