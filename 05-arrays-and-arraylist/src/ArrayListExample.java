import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main() {

//        syntax
        ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

//        add elements in list
        list.add(10);
        list.add(29);
        list.add(38);
        list.add(47);
        list.add(56);
        list.add(65);
        list.add(74);
        list.add(83);
        list.add(92);
        list.add(101);
        list.add(110);

        int[] arr = {12,23,34,45,89,56,56,67,87,87};

        System.out.println(list.contains(92));
        System.out.println(list);
        System.out.println(list.indexOf(83));
        System.out.println(list.isEmpty());
        System.out.println(list.getLast());
        System.out.println(list.equals(arr));
        System.out.println(list.removeLast());
        Integer i1 = list.removeLast();
        list.set(3,99);
        System.out.println(list);


//        taking input
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

//        get item at any index
        int l = list.size();
        for(int i = 0; i < l; i = i + 3){
            System.out.print(list.get(i) + " ");  //pass index here, list[index] syntax will not work here
        }
        System.out.println();

        System.out.println(list.reversed());


    }
}
