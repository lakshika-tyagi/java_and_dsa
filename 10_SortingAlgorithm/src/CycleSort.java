import java.util.Arrays;

public class CycleSort {
    static void main() {

        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        int [] arr2 = {1};
        cyclicSort(arr2);
        System.out.println(Arrays.toString(arr2));


    }

    static void swap(int[] arr,int a1, int a2){
        int temp = arr[a1];
        arr[a1] = arr[a2];
        arr[a2] = temp;
    }

    static void cyclicSort(int [] arr){
        int i = 0;
        while (i < arr.length){
            int correct_idx = arr[i] - 1;
            if(correct_idx == i){
                i++;
            }
            else{
                swap(arr,i,correct_idx);
            }
        }
    }
}
