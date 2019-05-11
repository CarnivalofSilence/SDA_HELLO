package pl.cwiczenia.structures.CompleteBinaryTree;

public class CompletetreeTest {
    public static void main(String[] args) {

        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.add(40L);
        tree.add(11L);
        tree.add(10L);
        tree.add(1L);
        tree.add(6L);
        tree.add(3L);

        System.out.println(tree);
        System.out.println("długość: " + tree.getTreeLength());
    }
}

/*


    System.out.println(tree.getValue(tree.getParentIndex( 0)));
        System.out.println(tree.getLeftChildIndex(1));
        System.out.println(tree.getRightChildIndex(1));
        System.out.println(tree.getParentIndex(3));

 */