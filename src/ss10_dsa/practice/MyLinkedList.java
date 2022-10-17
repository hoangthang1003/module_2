package ss10_dsa.practice;

import javax.xml.soap.Node;

public class MyClassList {
    private Node head;
    private int numNodes = 0;
    public MyClassList(Object data) {
        head = new Node(data);
    }
}
