package pl.cwiczenia.structures.BinaryTree;

public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }


    int length(Node node) {
        if (node.getLeftChild() == null && node.getRightChild() == null) {
            return 0;
        }
        int maxLength = 0;
        if (node.getRightChild() != null) {
            int rightChildLength = 1 + length(node.getRightChild());
            if (maxLength < rightChildLength) {
                maxLength = rightChildLength;
            }
        }
        if (node.getLeftChild() != null) {
            int leftChildLenght = 1 + length(node.getLeftChild());
            if (maxLength < leftChildLenght) {
                maxLength = leftChildLenght;
            }
        }
        return maxLength;

    }

    public void preOrder(Node node) {
        System.out.println(node.getValue());
        if (node.getLeftChild() != null) {
            preOrder(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            preOrder(node.getRightChild());
        }

    }

    public void inOrder(Node node) {

        if (node.getLeftChild() != null) {
            inOrder(node.getLeftChild());
        }
        System.out.println(node.getValue());

        if (node.getRightChild() != null) {
            inOrder(node.getRightChild());
        }
    }
}
//ctrl+alt+T surround with if