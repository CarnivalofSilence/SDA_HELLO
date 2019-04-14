package pl.cwiczenia.structures;

public class CustomLinkedList {

    private CustomNode root = null;
    private CustomNode tail = null;
    private int tabela = 0;

    void add(String value) {

        if (root == null) {
            CustomNode newNode = new CustomNode();
            newNode.setData(value);
            root = newNode;
            tail = newNode;
        } else {
            CustomNode newNode = new CustomNode();
            newNode.setData(value);
            tail.setNext(newNode);
            tail = newNode;
        }
        tabela++;
    }

    String get(int index) {
        CustomNode temp = root;
        int count = 0;
        while (temp != null) {
            if (index == count) {
                return temp.getData();
            }
            count++;
            temp = temp.getNext();//ctrl+alt+v -> stworzenie nowej zmiennej

        }
        return null;
    }

    void remove(int indexToRemove) {
        int count = 0;
        CustomNode prevoius = root;
        while (prevoius != null) {
            if (indexToRemove - 1 == count) {
                CustomNode next = prevoius.getNext().getNext();
                prevoius.setNext(next);

            } else {

                prevoius = prevoius.getNext();
                count++;
            }
        }

    }

    int length() {

        return tabela;
    }

    void printAll(){
        int count = 0;
        CustomNode temp = root;
        while (temp != null) {
            System.out.println(temp.getData());
            count++;
            temp = temp.getNext();

        }
    }
}

