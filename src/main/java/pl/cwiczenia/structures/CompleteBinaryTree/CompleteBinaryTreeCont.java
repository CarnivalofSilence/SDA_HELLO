package pl.cwiczenia.structures.CompleteBinaryTree;

import java.util.ArrayList;

public class CompleteBinaryTreeCont {

    private ArrayList<Long> arrayList = new ArrayList();
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

    void add(Long value) {
        arrayList.add(value);
    int koniec = arrayList.size()-1;
    if (getValue(getParentsIndex(koniec)) < getValue(koniec));
//   arrayList.set(getParentsIndex())
    }

    Long getValue(int index) {
        return arrayList.get(index);

    }

    int getTreeLength() {
        return arrayList.size();
    }
}



//int LastElementIndex = array.size() - 1;
//sout (lastElementIndex);
//sout (array.get(lastElementIndex)) ;

/*


Long valueInIndex3 = array.get(3);
Long valueInIndex2 = array.get(2);
array.set(2 , valueInIndex3);
array.set(3 , valueInIndex2);
sout()array)
 */


















