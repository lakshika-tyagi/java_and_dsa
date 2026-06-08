import java.util.Scanner;

public class Basics {
    static void main() {
        int i = 0;
        if(!(i == 0)) {
            System.out.println("Hello World");
        }
        else {
            System.out.println("else executed");
        }

        int count = 1;
        while(count <= 5){
            System.out.print(count + " ");
//            count += 1;
            count++;
        }
        System.out.println(" ");

//        for loop
        for (int j = 1; j < 11; j++) {
            System.out.println(j*5);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius : ");
        float c = input.nextFloat();
        float f = (c*9)/5 + 32;
        System.out.println("Temperature in Fahrenheit is " + f);

    }
}
