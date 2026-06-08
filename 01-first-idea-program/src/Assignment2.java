import java.util.Scanner;
import  java.lang.String;

public class Assignment2 {
    static void main() {
        Scanner input = new Scanner(System.in);
//        find no. is even or odd
        int num1 = input.nextInt();
        if(num1 % 2 == 0){
            System.out.printf("%d is even\n",num1);
        }
        else{
            System.out.printf("%d is odd\n",num1);
        }

//       ques2.  hello for a specific name
        String name2 = input.next();
        System.out.println("Hello " + name2);

//        q3 . find si
        int p = 23000;
        int r = 4, t = 2;
        System.out.printf("simple interest is %d\n",p*r*t/100);

//        q4 . 2 numbers and an operator
        int a = input.nextInt();
        int b = input.nextInt();
        char op = input.next().trim().charAt(0);
        switch(op) {
            case '+' :
                System.out.printf("sum is %d\n",a+b);
                break;
            case '-' :
                System.out.printf("difference is %d\n",a-b);
                break;
            case '*' :
                System.out.printf("product is %d\n",a*b);
                break;
            case '/':
                if(b == 0){
                    System.out.println("division not possible");
                }
                else{
                    System.out.printf("quotient is %d\n",a/b);
                }
        }

//        q5. largest from 2 numbers
        if(a > b){
            System.out.printf("%d is larger then %d\n",a,b);
        }
        else{
            System.out.printf("%d is larger then %d\n",b,a);
        }

//        q6.rupees to usd
        System.out.println("usd is "+ a*0.010);

//        q7.fibbonacci series upto n
        int num7 = input.nextInt();
        int prev = 1 , curr = 0, temp;
        for(int i = 0; i <= num7; i++){
            System.out.print(curr + " ");
            temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        System.out.println(" ");

//        q8. string is palindrome or not
        int length = name2.length();
        int j = length-1;
        int check = 1;
        for(int i = 0; i < length/2; i++){
            if(name2.charAt(i) != name2.charAt(j)){
                System.out.println("not a palindrome");
                check = 0;
                break;
            }
            j--;
        }
        if(check == 1){
            System.out.println("palindrome");
        }

//        q9. Armstrong between 2 numbers
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        for(int i = n1; i <= n2; i++){
            temp = i;
            int sum = 0;
            while(temp != 0){
                int rem = temp%10;
                sum += rem*rem*rem;
                temp = temp/10;
            }
            if(sum == i){
                System.out.print(i + " ");
            }
        }

    }
}
