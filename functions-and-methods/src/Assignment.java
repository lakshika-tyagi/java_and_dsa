import java.util.Scanner;

public class Assignment {
    static void main() {
//        Scanner input = new Scanner(System.in);

        max_min(12,12,3);
        even_odd(32);
        System.out.println("for age 18, person can vote ? "+ vote(18));
        System.out.println("for 12 and 13, the sum is "+ sum(12,13));
        System.out.println("for 12 and 13, the product is "+ product(12,13));
        area_circumference(7);
        if(prime(13) == 1) System.out.println("13 is a prime");
        else System.out.println("13 is not prime");
        grade(45);
        System.out.println("factorial of 9 is "+ factorial(9));
        if(triplet(12,13,5) == 1) System.out.println("12,13 & 5 forms a triplet");
        else System.out.println("12,13 & 5 forms a triplet");
        prime_range(1,100);
        System.out.println("sum of first 10 numbers is "+ sum(10));


    }
    static void max_min(int a, int b, int c){
        int l, s;
        if(a >= b && a >= c)l = a;
        else if(b >= a && b >= c)l = b;
        else l = c;
        if(a < b && a < c)s = a;
        else if(b < a && b < c)s = b;
        else s = c;
        System.out.printf("largest num is %d\nsmallest num is %d\n",l,s);
    }

    static void even_odd(int a){
        if(a%2 == 0)
            System.out.println(a + " is even.");
        else
            System.out.println(a + " is odd.");
    }

    static boolean vote(int a){
        if(a >= 18)
            return true;
        else
            return false;
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int product(int a, int b){
        return a*b;
    }

    static void area_circumference(int r){
        System.out.println("the area is "+ 3.14*r*r);
        System.out.println("the circumference is "+ 2*3.14*r);
    }

    static int prime(int n){
        if(n == 0 || n ==1)
            return 0;
        else{
            for(int i = 2; i <= n/2; i++){
                if(n%i == 0)
                    return 0;
            }
        }
        return 1;
    }

    static void grade(int m){
        if(m >= 91 && m <= 100)
            System.out.println("Grade is AA");
        else if(m >= 81 && m <= 90)
            System.out.println("Grade is AB");
        else if(m >= 71 && m <= 80)
            System.out.println("Grade is BB");
        else if(m >= 61 && m <= 70)
            System.out.println("Grade is BC");
        else if(m >= 51 && m <= 60)
            System.out.println("Grade is CD");
        else if(m >= 41 && m <= 50)
            System.out.println("Grade is DD");
        else if(m <= 40)
            System.out.println("Fail");
        else
            System.out.println("enter valid marks");
    }

    static int factorial(int n){
        if(n == 1 || n == 0)
            return 1;
        else {
            int p = 1;
            for(int i = 2; i <= n; i++){
                p *= i;
            }
            return p;
        }
    }

    static int triplet(int a, int b, int c){
        if(a > b && a > c){
            if(a*a == b*b + c*c)
                return 1;
            else return 0;
        }
        else if(b > a && b > c){
            if(b*b == a*a + c*c)
                return 1;
            else return 0;
        }
        else if(c > a && c > b){
            if(c*c == a*a + b*b)
                return 1;
            else return 0;
        }
        return 0;
    }

    static void prime_range(int n1, int n2){
        for(int i= n1; i <= n2; i++){
            if(prime(i) == 1)
                System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    static int sum(int n){
        int s = 0;
        for(int i = 1; i <= n; i++){
            s += i;
        }
        return s;
    }
}
