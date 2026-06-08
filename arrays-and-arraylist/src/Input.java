import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static void main() {
        Scanner input = new Scanner(System.in);

//        array of primitives
//        int [] arr = new int[5];
//        System.out.println(Arrays.toString(arr));

//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 33;
//        arr[3] = 50;
//        arr[4] = 76;
//        System.out.println(arr[3]);

//        easy way to print the array
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr);

//        input using for loops
//        for (int i = 0; i < 5; i++) {
//            arr[i] = input.nextInt();
//        }

//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for(int i : arr){
//            System.out.print(i + " ");
//        }
//        System.out.println(" ");

//        System.out.println(arr[6]); //index out of bound error

//        array of objects
        String[] arr1 = new String[4];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1); //[Ljava.lang.String;@681a9515

        arr1[2] = "lakshika tyagi";
        System.out.println(Arrays.toString(arr1));
    }
}
