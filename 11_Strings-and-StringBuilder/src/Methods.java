import java.util.Arrays;

public class Methods {
    static void main() {
        String name = "Lakshika Tyagi";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase());

        System.out.println(name.indexOf('j'));
        System.out.println(name.lastIndexOf('a'));

        System.out.println("   Lakshika   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
