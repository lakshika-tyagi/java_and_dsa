import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner input = new Scanner(System.in);

//        take input from user till it press x

        while(true){
            System.out.print("Enter the operation : ");
            char c = input.next().trim().charAt(0);
            if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%'){
                System.out.print("Enter num1 : ");
                int num1 = input.nextInt();
                System.out.print("Enter num2 : ");
                int num2 = input.nextInt();
                if(c == '+'){
                    System.out.println(num1 + num2);
                }
                else if(c == '-')
                    System.out.println(num1 - num2);
                else if (c == '*')
                    System.out.println(num1*num2);
                else if (c == '%')
                    System.out.println(num1%num2);
                else
                    if(num2 == 0)
                        System.out.println("num2 should not be zero ");
                    else {
                        System.out.println(num1/num2);
                    }
            }
            else if (c == 'x' || c == 'X')
                break;
            else
                System.out.println("Enter a valid operation");
        }
    }
}
