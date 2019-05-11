package pl.cwiczenia.structures.TreePower;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String value;
     private List<Node> children = new ArrayList<>();
    private Node leftChild;
    private Node rightChild;

    void setValue(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }

    void addChild(Node node) {
        children.add(node);
 }





    public Node(String value) {
        this.value = value;
    }
}

