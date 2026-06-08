import java.util.Scanner;

public class Loops {
    static void main() {
        Scanner input = new Scanner(System.in);

//        for loop
//        for (int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }
        int num = input.nextInt();
//        for (int i = 1; i <= num; i++) {
////            System.out.print(i + " ");
//            System.out.print("Hello-world" + " ");
//        }

//        while loop
//        while(num <= 5){
//            System.out.print(num + " ");
//            num+=1;
//        }

//        do while loop
        do{
            System.out.print(num + " ");
            num++;
        }while(num <= 10);
    }
}
