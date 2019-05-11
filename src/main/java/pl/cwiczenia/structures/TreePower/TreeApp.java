package pl.cwiczenia.structures.TreePower;

public class TreeApp {
    public static void main(String[] args) {
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
        Node childE = new Node("E");
        childB.addChild(childE);
        Node childF = new Node("F");
        childB.addChild(childF);
        Node childG = new Node("G");
        childB.addChild(childG);
        root.addChild(childB);
        Node childC = new Node("C");
        root.addChild(childC);
        Node childD = new Node("D");
        Node childH = new Node("H");
        childB.addChild(childH);
        childB.addChild(childD);
        Tree tree = new Tree();
        tree.setRoot(root);

    }
//Alt + 9 pokazuje ostatnie zakomunitowane w gicie pliki

}
