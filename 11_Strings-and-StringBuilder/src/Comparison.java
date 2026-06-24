public final class Comparison {
    static void main() {

//        to check whether different string variables points to same object,  we do string comparison
        String a = "Lakshika";
        String b = "Lakshika Tyagi";

//        ==
        System.out.print(a == b);
        System.out.println(" " + a.equals(b));

        a = a + " Tyagi";
        System.out.print(a == b );
        System.out.println(" " + a.equals(b));

        a = "Lakshika Tyagi";
        System.out.print(a == b);
        System.out.println(" " + a.equals(b));

//        creating diff. objects of same value
        String a1 = new String("Hello");
        String b1 = new String("Hello");
        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));


    }
}
