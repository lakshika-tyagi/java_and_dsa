import java.util.Arrays;

public class SelectionSort {
    static void main() {

        int[] arr = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
//            find the maximum element in the array and swap it with correct index
            int last = n - i - 1;
            int max = 0;
            for (int j = 0; j <= last; j++) {
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
    }
}
