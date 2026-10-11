package cloning;

import java.util.Arrays;

public class Main {
    static void main() throws CloneNotSupportedException {
        Human kunal = new Human(34, "Kunal");
//        Human twin = new Human(kunal);


        Human twin = (Human) kunal.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        twin.age = 45;

        System.out.println(Arrays.toString(twin.arr));

        System.out.println(Arrays.toString(kunal.arr));
        System.out.println(kunal.age + " " + kunal.name);


    }


}
