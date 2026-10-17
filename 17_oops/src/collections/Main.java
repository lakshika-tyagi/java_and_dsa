package collections;

import java.util.*;

public class Main {
    static void main() {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();

        list1.add(23);
        list1.add(34);

        System.out.println(list1.isEmpty());
        System.out.println(list1);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);

        System.out.println(vector);

    }
}
