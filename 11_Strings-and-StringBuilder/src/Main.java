public class Main {
    static void main() {

//        string literal
        String name = "Lakshika Tyagi";
        System.out.println(name);


        String a = "hello";
        String b = "hello";
//        String pool : both a and b point to the same object "hello" in the heap memory , helps in optimization


        b = b + " !";
//        string immutability : here b is assigned to new object, we haven't modified b as strings are immutable


        System.out.println(a + b);
//        only b is changed , a has still the same value

        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(20));  //StringIndexOutOfBoundsException
    }
}