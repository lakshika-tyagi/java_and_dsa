import java.util.Scanner;

public class Questions {
    static void main() {
        Scanner input = new Scanner(System.in);

//        ques1.largest of 3 input numbers
//        System.out.print("Enter num1 : ");
//        int num1 = input.nextInt();
//        System.out.print("Enter num2 : ");
//        int num2 = input.nextInt();
//        System.out.print("Enter num3 : ");
//        int num3 = input.nextInt();
//        int m = Math.max(num2,num3);
////        System.out.println("The largest number is :" + Math.max(num1,m));
//        m = num1;
//        if(m < num2){
//            m = num2;
//        }
//        if(m < num3){
//            m = num3;
//        }
//        System.out.println("The largest number is :" + m);

//        ques2.alphabet case check
//        System.out.print("Enter an alphabet to check : ");
//        char alp = input.next().charAt(0);
////        System.out.println(alp+1);
//        if((alp >= 97) && (alp <= 123))
//            System.out.println("Lowercase");
//        else if((alp >= 'A') && (alp <= 'Z'))
//            System.out.println("Uppercase");
//        else
//            System.out.println("Enter a valid alphabet");

//        ques3.fibonacci numbers
//        System.out.print("Enter the number upto which you want Fibonacci series : ");
//        int n = input.nextInt();
//        System.out.print("The fibonacci series is : 0 , 1, ");
//        int prev_1 = 1;
//        int prev_2 = 0;
//        int fib = 0;
//        for(int i = 2; i <= n;i ++){
//            fib = prev_1 + prev_2;
//            System.out.print(fib + ", ");
//            prev_2 = prev_1;
//            prev_1 = fib;
//        }
//        System.out.println();
//        System.out.println("nth fibonacci number is : "+ fib);

//        ques4.counting occurrences
//        System.out.print("Enter the number : ");
//        int num = input.nextInt();
//        System.out.print("Enter the digit whose occurrence you want to check : ");
//        int digit = input.nextInt();
//        int count = 0;
//        while(num != 0){
//            int rem = num%10;
//            if(digit == rem){
//                count++;
//            }
//            num = num/10;
//        }
//        System.out.println("The occurrence of digit is : "+ count);

//        ques5.reverse the number
        System.out.print("Enter the number you want to reverse : ");
        int num = input.nextInt();
        int rev = 0;
        while(num != 0){
            int rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println("The reversed number is : "+ rev);



    }
}
