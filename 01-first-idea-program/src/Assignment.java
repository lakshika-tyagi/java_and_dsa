import java.util.Scanner;

public class Assignment {
    static void main() {
        Scanner input = new Scanner(System.in);
//        ques1. input a year and find it is leap or not
        System.out.print("Please enter a year : ");
        int year = input.nextInt();
        if (year%400 == 0){
            System.out.println("It is a leap year !");
        } else if ((year %4 == 0 )&& (year%100 != 0)) {
            System.out.println("It is a leap year !");
        }
        else {
            System.out.println("Not a leap year !");
        }

//        ques2.Take two numbers and print the sum of both
        System.out.print("Enter num1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = input.nextInt();
        System.out.println( "Sum of these two numbers is " + (num1+num2));

//        ques3.Take a number as input and print the multiplication table for it.
        System.out.print("Enter the number : ");
        int digit = input.nextInt();
        System.out.println("Multiplication table is : ");
        for (int i = 1; i < 11; i++) {
            System.out.println(digit + " X " + i + " = " + (digit*i));
        }

//        ques4.Take 2 numbers as inputs and find their HCF and LCM.
        System.out.print("Enter num1 : ");
        int n1 = input.nextInt();
        System.out.print("Enter num2 : ");
        int n2 = input.nextInt();
        int hcf = 1;
        int min = Math.min(n1,n2);
        for (int i = min; i >= 1; i--) {
            if((n1 % i == 0) && (n2 % i == 0)) {
                hcf = i;
                break;
            }
        }
        int lcm = (n1*n2)/hcf;
        System.out.println("HCF and LCM are : "+ (hcf) + " "+ (lcm));

    }
}
