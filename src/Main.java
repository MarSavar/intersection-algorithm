public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(72);
        Node node2 = new Node(353);
        Node node3 = new Node(54);
        Node node4 = new Node(21);
        Node node5 = new Node(128);

        LinkedList linkedList = new LinkedList(node1, node2, node3, node4, node5);

        Node node6 = new Node(2);
        Node node7 = new Node(1);
        Node node8 = new Node(44);
        LinkedList linkedList2 = new LinkedList(node6, node7, node8);

        linkedList.printList();
        linkedList2.printList();

        node5.next = node6;

    }
}
