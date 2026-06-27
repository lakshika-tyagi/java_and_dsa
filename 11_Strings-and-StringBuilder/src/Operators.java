import java.util.ArrayList;

public class Operators {
    static void main() {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");

        System.out.println((char)('a' + 3));
        System.out.println("a" + 3);
//        int will be converted to its wrapper class Integer that will call toString() method
//        this is after same steps as "a" + "1"

//        string concatenate with objects
        System.out.println("Lakshika" + new ArrayList<>());
        System.out.println("Lakshika" + new Integer(34));

//        object concatenate with objects
//        System.out.println(new Integer(45) + new ArrayList<>());  //error : operator cannot be applied when both are objects

        System.out.println("" +new Integer(34) +  new int[]{} );
    }
}
