package cracking.ch04.five;

import cracking.ch04.Node;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchTreeServiceTest {
    private BinarySearchTreeService binarySearchTreeService = new BinarySearchTreeService();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void check_Unbalanced() throws Exception {
        // given
        Node head = makeUnbalancedTree();

        // when
        boolean result = binarySearchTreeService.check(head);

        // then
        assertThat(result, is(false));
    }

    @Test
    public void check_Balanced() throws Exception {
        // given
        Node head = makeBalancedTree();

        // when
        boolean result = binarySearchTreeService.check(head);

        // then
        assertThat(result, is(true));
    }

    private Node makeUnbalancedTree() {
        Node node1 = new Node("1", 1);
        Node node2 = new Node("2",2 );
        Node node3 = new Node("3", 3);
        Node node4 = new Node("4",4 );
        Node node5 = new Node("5",5 );
        Node node6 = new Node("6",6 );
        Node node7 = new Node("7",7 );
        Node node8 = new Node("8",8 );
        Node node9 = new Node("9",9 );

        node1.children = new Node[]{node2, node3};
        node2.children = new Node[]{node4, node5};
        node3.children = new Node[]{node6, node7};
        node4.children = new Node[]{node8, null};
        node8.children = new Node[]{node9, null};

        return node1;
    }

    private Node makeBalancedTree() {
        Node node1 = new Node("1", 1);
        Node node2 = new Node("2",2 );
        Node node3 = new Node("3", 3);
        Node node4 = new Node("4",4 );
        Node node5 = new Node("5",5 );
        Node node6 = new Node("6",6 );
        Node node7 = new Node("7",7 );
        Node node8 = new Node("8",8 );

        node5.children = new Node[]{node3, node7};
        node3.children = new Node[]{node2, node4};
        node2.children = new Node[]{node1, null};
        node7.children = new Node[]{node6, node8};

        return node1;
    }
}