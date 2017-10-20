package cracking.ch04;

public class Node {
    private static final int CHILDREN_SIZE = 10;

    public String name;
    public Node[] children = new Node[CHILDREN_SIZE];
    public VisitedType visited;
    public Node next;

    public Node(String name) {
        this.name = name;
    }
}
