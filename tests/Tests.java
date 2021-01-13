import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testNode1() {
        Node node = new Node(1);
        Assert.assertEquals((int)node.value,1);
        Assert.assertNull(node.next);
    }

    @Test
    public void testLinkedList() {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        LinkedList linkedList = new LinkedList(node1);
        linkedList.addNext(node2);
        Assert.assertEquals(node1.next, node2);
    }

    @Test
    public void testLinkedList2() {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        LinkedList linkedList = new LinkedList(node1, node2, node3);
        Assert.assertEquals(node1.next.next, node3);
    }

    @Test
    public void testLinkedList3() {
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        LinkedList linkedList = new LinkedList(node1, node2, node3);
        Assert.assertEquals(node1.next.value, node2.value);
    }

    @Test
    public void testIntersection() {
        LinkedList list1 = new LinkedList(new Node(1), new Node(2), new Node(3));
        LinkedList list2 = new LinkedList(new Node(3), new Node(4), new Node(5));
        LinkedList list3 = Main.intersect(list1, list2);
        Assert.assertEquals((int)list3.head.value, 3);
        Assert.assertNull(list3.head.next);
    }
}
