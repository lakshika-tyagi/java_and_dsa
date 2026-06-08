import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    static void main() {
        /*
          1 2 3
          4 5 6
          7 8 9
        */

        Scanner in = new Scanner(System.in);


//        syntax
//        int[][] arr = new int[r][c];   no. of columns,c does not need to be specified; rows are mandatory to specify
        int[][] arr = new int[3][];
        System.out.println(Arrays.toString(arr));


//        storing arrays directly
        int[][] arr1 = {
                {1,2,3},   //0th index
                {4,5,6},   //1st index
                {7,8,9}    //2nd index
        };
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr1[1]));

//        rows having variable no. of columns
        int[][] arr2 = {
                {1,2,3,4,5,6,7},
                {8,9},
                {10,20,30,40,50}
        };
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[1][0]);


//        input of 2d arrays
//        int[][] arr3 = new int[3][2];
//
//        for(int r = 0; r < arr3.length; r++){
////            now, we take every row
//            for(int c = 0; c < arr3[r].length; c++){
//                arr3[r][c] = in.nextInt();
//            }
//        }

//        System.out.println("variable columns");
//        input for variable columns
//        for(int r = 0; r < arr2.length; r++){
////            now, we take every row
//            for(int c = 0; c < arr2[r].length; c++){
//                arr2[r][c] = in.nextInt();
//            }
//        }

//        printing arrays

//        using loops
        for (int[] value : arr2) {
            for (int i : value) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

//        using method
        System.out.println(Arrays.deepToString(arr2));

        for (int[] ints : arr2) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
