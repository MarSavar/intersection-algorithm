public class Main {
    
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(500);
        Node node6 = new Node(1024);

        LinkedList linkedList = new LinkedList(node1, node2, node3, node4, node5, node6);

        Node node7 = new Node(1);
        Node node8 = new Node(2);
        Node node9 = new Node(3);
        Node node10 = new Node(40);
        Node node11 = new Node(128);
        Node node12 = new Node(500);
        Node node13 = new Node(10000);

        LinkedList linkedList2 = new LinkedList(node7, node8, node9, node10, node11, node12, node13);

        System.out.print("First list: ");
        linkedList.printList();
        System.out.print("Second list: ");
        linkedList2.printList();

        LinkedList intersection = IntersectLinkedLists.intersect(linkedList, linkedList2);
        System.out.print("Intersection: ");
        intersection.printList();

    }
}
