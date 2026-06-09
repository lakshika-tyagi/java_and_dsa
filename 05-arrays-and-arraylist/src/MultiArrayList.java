import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayList {
    static void main() {
        Scanner in = new Scanner(System.in);

//        syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);

//        initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

//        add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
