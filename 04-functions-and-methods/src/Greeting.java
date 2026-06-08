import java.util.Scanner;

public class Greeting {
    static void main() {
        greeting();
        String message = Greet();
        System.out.println(message);
        System.out.println(greet2("Lakshika Tyagi"));
    }
    static void greeting(){
//        Scanner input = new Scanner(System.in);
        System.out.println("Hello World");
    }
    static String Greet () {
        String greeting = "How are you ? ";
        return greeting;
    }

    static String greet2(String name){
        return "Hello " + name;
    }
}
