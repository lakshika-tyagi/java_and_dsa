import java.util.Scanner;

public class TypeCasting {
    static void main() {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextFloat();
//        System.out.println(num);

//        typecasting
        int marks = (int)(67.9334f) ;
        System.out.println(marks);

//        automatic type promotion in expression
        int a = 256;
        byte b = (byte)a;
        System.out.println(b);

        byte a1 = 40;
        byte a2 = 50;
        byte a3 = 100;
        int a4 = (a1*a2)/a3;
//        byte a4 = (byte)(a1*a2)/a3; //will give error
        System.out.println(a4);

        int n1 = '!';
        System.out.println(n1);

        System.out.println(23*342.3544892873f);

        byte b1 = 42;
        char b2 = 'a';
        short b3 = 1024;
        int b4 = 50000;
        float b5 = 5.67f;
        double b6 = 0.1234;
        double br = (b5*b1) + (b4/b2) - (b6-b3);
        System.out.println((b5*b1) + " " + (b4/b2) + " " + (b6-b3));
        System.out.println(br);
    }
}
