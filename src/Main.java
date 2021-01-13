public class Main {

    /**
     *
     * @param list1 First linked list
     * @param list2 Second linked list
     * @return a new linked list of elements that are common to both linked list.
     *
     * WARNING: the two lists must be sorted first!
     */
    public static LinkedList intersect(LinkedList list1, LinkedList list2) {

        LinkedList intersection = new LinkedList();
        Node pointer1 = list1.head;
        Node pointer2 = list2.head;
        while (pointer1 != null && pointer2 != null) {
            if (pointer1.value.equals(pointer2.value)) {
                intersection.addNext(new Node(pointer1.value));
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }
            else if (pointer1.value < pointer2.value) {
                pointer1 = pointer1.next;
            }
            else {
                pointer2 = pointer2.next;
            }
        }
        return intersection;

    }

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

        LinkedList intersection = intersect(linkedList, linkedList2);
        System.out.print("Intersection: ");
        intersection.printList();

    }
}
