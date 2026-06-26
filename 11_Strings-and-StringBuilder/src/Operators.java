public class Operators {
    static void main() {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");

        System.out.println((char)('a' + 3));
        System.out.println("a" + 3);
//        int will be converted to its wrapper class Integer that will call toString() method
//        this is after same steps as "a" + "1"


    }
}
