package generics;

import java.util.Arrays;
import java.util.List;

//https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

public class CustomGenericArrayList<T> {

    private T[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;  //also working as index value

    public CustomGenericArrayList() {
        this.data = new T[DEFAULT_SIZE];
    }

    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();   // OK
        list.add(elem);
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        T[] temp = new T[data.length * 2];
//        copy the current items in the current array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size + '}';
    }

    static void main() {
//        ArrayList<Object> list = new ArrayList<>();

        CustomGenericArrayList list = new CustomGenericArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list);

    }
}
