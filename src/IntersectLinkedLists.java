public class IntersectLinkedLists {
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
}
