package pl.cwiczenia.structures;

public class CustomArrayList {
    private String[] data = new String[4];

    int index = 0;

    void add(String value) {
        data[index] = value;
        index++;
    }

    String get(int index) {

        if (index > data.length) {

        }
        return data[index];
    }

    void remove(int IndexToRemove) {
        if (IndexToRemove < 0 || IndexToRemove > lenght()){
            throw new IllegalArgumentException("zły argument" + IndexToRemove);
        }

        data[IndexToRemove] = null;

        for (int i = IndexToRemove; i < lenght()-1; i++) {
            data[i] = data[i +1];
        }
        this.index--;


    }

    int lenght() {
        return index;
    }

    void printAll(){
        System.out.println("wszystkie");
        for (int i = 0; i < lenght(); i++) {
            System.out.println(get(i));
        }
    }
}
