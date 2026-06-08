import java.util.Scanner;

public class Assignment {
    static void main() {
        Scanner input = new Scanner(System.in);

//        reverse a string
        String str = input.nextLine();
        int length = str.length();
        String rev_str = "" ;
        for(int i = 0; i < length; i++){
            rev_str = str.charAt(i) + rev_str;
        }
        System.out.println(rev_str);


//        program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        int num2;
        int sum_e = 0 , sum_o = 0 , sum_n = 0;
        num2 = input.nextInt();
        while(num2 != 0){
            if(num2 < 0)
                sum_n += num2;
            else if (num2 % 2 == 0)
                sum_e += num2;
            else
                sum_o += num2;
            num2 = input.nextInt();
        }
        System.out.printf("sum of even numbers: %d\nsum of odd numbers: %d\nsum of negative numbers: %d\n",sum_e,sum_o,sum_n);

//        perfect numbers
        int num3 = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num3/2; i++) {
            if(num3%i == 0){
                sum += i;
            }
        }
        if(sum == num3){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }


//        hcf of 2 numbers
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int small = (n1<n2)?n1:n2;
        int hcf = 1;
        for(int i = small; i >= 2;i-- ){
            if(n1%i == 0 && n2%i == 0){
                hcf = i;
                break;
            }
        }
        System.out.println("hcf is "+ hcf);

    }
}
