public class LinkedList {

    Node head;


    public LinkedList(Node... nodes) {

        this.head = nodes[0];
        int i = 0;
        while (i < nodes.length - 1) {
            nodes[i].next = nodes[i+1];
            i++;
        }
    }

    public LinkedList() {

    }

    void addNext(Node node) {
        if (this.head != null) {
            Node pointer = this.head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = node;
        } else {
            this.head = node;
        }
    }



    void printList() {
        Node pointer = head;
        String list = "";
        String concat = "";
        while (pointer != null) {
            list += concat + pointer.value;
            concat = " -> ";
            pointer = pointer.next;
        }
        System.out.println(list);
    }



}
