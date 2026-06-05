import java.util.Scanner;

public class Questions {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
        armstrong();
    }

//    print all the three digit Armstrong numbers
    static void armstrong(){
        int n = 100;
        int num,rem,sum;
        while(n < 1000){
            sum = 0;
            num = n;
            while(num != 0){
                rem = num%10;
                sum += (rem*rem*rem);
                num = num/10;
            }
            if(sum == n) System.out.print(n+" ");
            n++;
        }
    }

//    check prime
    static boolean isPrime(int n){
        if(n <= 1)return false;
        int check = 0;
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;

    }
}

