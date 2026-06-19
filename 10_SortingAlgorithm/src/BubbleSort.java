import java.util.Arrays;

public class BubbleSort {
    static void main() {

        int[] arr= {3,2,1,0,-1};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int [] arr){
        boolean swap = false;
        int n = arr.length;
//        run the steps n-1 times
        for(int i = 0; i < n-1; i++ ){
//            for each step, max item will come at the last respective index
            for(int j = 1; j < n - i ; j++){
//                swap if item is smaller than the previous item
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
//            if you didn't swap for a particular value of i means array is sorted hence stop the program
            if(!swap)break;
        }
    }


}
