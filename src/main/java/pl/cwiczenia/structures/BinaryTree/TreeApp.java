package pl.cwiczenia.structures.BinaryTree;

public class TreeApp {
    public static void main(String[] args) {

        //Alt + 9 pokazuje ostatnie zakomunitowane w gicie pliki
   /*
        Tree tree = new Tree();
        Node child1 = new Node();
        child1.setValue("Listek 1");
        Node child2 = new Node();
        child2.setValue("Listek 2");
        Node child3 = new Node();
        child3.setValue("Listek 3");
        Node child4 = new Node();
        child4.setValue("Listek 4");
        tree.getRoot().addChild(child1);
        tree.getRoot().addChild(child2);
        tree.getRoot().addChild(child3);
        tree.getRoot().addChild(child4);
        for (Node child : tree.getRoot().getChildren()) {
            System.out.println(child.getValue());
        }
*/
        Node root = new Node("A");

        Node childB = new Node("B");
        root.setLeftChild(childB);
        Node childD = new Node("D");
        childB.setLeftChild(childD);
        Node childE = new Node("E");
        childB.setRightChild(childE);
        Node childC = new Node("C");
        root.setRightChild(childC);
        Node childF = new Node("F");
        childC.setLeftChild(childF);
        Node childG = new Node("G");
        childC.setRightChild(childG);

        root.setLeftChild(childB);
        root.setRightChild(childC);
        childB.setLeftChild(childD);
        childB.setRightChild(childE);
        childC.setLeftChild(childF);
        childC.setRightChild(childG);
        Tree tree = new Tree();
        tree.setRoot(root);
        tree.length(root);
        tree.setRoot(root);

        System.out.println(tree.length(root));
        System.out.println(tree.length(childC));
        System.out.println(tree.length(childF));

        tree.preOrder(root);
        System.out.println("---------------------------------------------------------------");
        tree.inOrder(root);


    }
}
