import java.lang.reflect.Array;
import java.util.Arrays;

public class Overloading {
    static void main() {
        demo(2,3,4);
        demo("Lakshika","tyagi");

        System.out.println(sum(2,5));
        System.out.println(sum(23,65,23));

    }
    static int sum(int a, int b){
        System.out.println("first one");
        return a+b;
    }
    static int sum(int a, int b, int c){
        System.out.println("second one");
        return a+b+c;
    }

    static void demo(String ...v){
        System.out.println("String demo");
        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v){
        System.out.println("Int demo");
        System.out.println(Arrays.toString(v));
    }
}
