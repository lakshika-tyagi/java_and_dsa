import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = {18,12,9,14,77,50};
        int key = in.nextInt();
        int i = 0;
        for (i = 0 ; i < arr.length; i++) {
            if(arr[i] == key){
                System.out.println("element found at " + i);
                break;
            }
        }
        if(i == arr.length) System.out.println("element not found");
    }
}
