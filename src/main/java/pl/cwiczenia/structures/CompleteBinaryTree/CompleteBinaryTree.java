package pl.cwiczenia.structures.CompleteBinaryTree;
/*
import java.util.ArrayList;

public class CompleteBinaryTree {
    private ArrayList<String> arrayList = new ArrayList();
    //private String[] tab = new String[100];


    int getParentsIndex(int childIndex) {
        int o = childIndex;
        return (o - 1) / 2;
    }

    int getLeftchildIndex(int parentsIndex) {
        int left = parentsIndex;
        return (2 * left + 1);
    }


    int getRightchildIndex(int parentsIndex) {
        int right = parentsIndex;
        return (2 * right + 2);
    }

    void add(String value) {
        arrayList.add(value);
    }

    String getValue(int index) {
        return arrayList.get(index);

    }

    int getTreeLength() {
        return arrayList.size();
    }

//void add(String value){arrayList.add(value);}
//String getValue(int index){return arrayList.get(index);}
}

*/


import java.util.ArrayList;

public class CompleteBinaryTree {
    private ArrayList<Long> arrayList = new ArrayList<>();

    int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    Long getLeftValue(int parentIndex) {
        int leftChildIndex = getLeftChildIndex(parentIndex);
        return getValue(leftChildIndex);
    }

    int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    Long getRightValue(int parentIndex) {
        int rightChildIndex = getRightChildIndex(parentIndex);
        return getValue(rightChildIndex);
    }

    int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }


    int getTreeLength() {
        return arrayList.size();
    }

    void add(Long value) {
        arrayList.add(value);
        int addedIndex = arrayList.size() - 1;
        addAtIndex(addedIndex);

    }

    private void addAtIndex(int addedIndex) {
        if (addedIndex == 0){
            return;
        }
        Long value = getValue(addedIndex);
        int parentIndex = getParentIndex(addedIndex);
        if (parentIndex >= 0) {
            Long parentValue = getValue(parentIndex);
            if (parentValue < value) {
                arrayList.set(parentIndex, value);
                arrayList.set(addedIndex, parentValue);
                addAtIndex(parentIndex);
            }
        }
    }

    @Override
    public String toString() {
        return "CompleteBinaryTree{" +
                "arrayList=" + arrayList +
                '}';
    }

    Long getValue(int index) {
        return arrayList.get(index);
    }
}

