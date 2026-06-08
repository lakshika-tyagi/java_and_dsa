import java.util.Scanner;

public  class Sum {
    static void main() {
//        input take 2 numbers and print sum
//        int k = sum2();
//        System.out.println("The sum is : "+ k);
        System.out.println(sum3(3,8));
    }

    static void sum () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : "+ sum);
    }

//    returning value
    static int sum2 () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = in.nextInt();
        return num1 + num2;
    }

//    pass the value of numbers when you are calling the function in main()
    static int sum3(int a,int b){
        return a+b;
    }
}
