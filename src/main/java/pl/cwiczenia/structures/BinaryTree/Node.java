package pl.cwiczenia.structures.BinaryTree;

public class Node {
    private String value;

    private Node leftChild;
    private Node rightChild;

    void setValue(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }


    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node(String value) {
        this.value = value;
    }
}

