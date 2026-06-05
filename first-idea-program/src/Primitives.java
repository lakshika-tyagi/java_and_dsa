import java.util.Scanner;

public class Primitives {
    public static void main() {
        int rollno = 64;
        char letter = 'j';
        float my_marks = 98.67f;
        double large = 2384234.2892392;
        long largeInt = 231_924_01L;
        boolean check = false;

//        string is not primitive
        String my_name = "Lakshika";

//        System.out.print("Please enter some input : ");
          Scanner input = new Scanner(System.in);
//        int roll = input.nextInt();
//        System.out.println("Your roll no is "+ roll);

//        String name = input.nextLine();
//        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
