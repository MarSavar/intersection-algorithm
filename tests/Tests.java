import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void testNode1() {
        Node node = new Node(1,null);
        Assert.assertEquals(node.getValue(),1);
    }
}
