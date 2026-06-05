import java.util.Scanner;

void main() {
    System.out.print("Hello world");
    System.out.println(" No new line is added");
    Scanner input = new Scanner(System.in);
    System.out.println(input.nextInt()) ;
    System.out.println(input.nextLine()) ;
    System.out.println(input) ;
}
