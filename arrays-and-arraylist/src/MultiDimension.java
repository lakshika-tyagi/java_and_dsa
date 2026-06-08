import java.util.Arrays;

public class MultiDimension {
    static void main() {
        /*
          1 2 3
          4 5 6
          7 8 9
        */


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
                {1,2,3,4,5,6,7,8},
                {9},
                {10,20,30,40,50}
        };
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[1][0]);

//        input of 2d arrays
    }
}
