import java.util.Arrays;

public class Questions {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        swap(arr,1,7);
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));
        System.out.println(maxRange(arr,3,7));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    static int max(int[] arr){
        int m = arr[0];
        if(arr == null)return -1;
        for(int i = 1; i < arr.length; i++){
            if(m < arr[i]){
                m = arr[i];
            }
        }
        return m;
    }

    static int maxRange(int[] arr, int i1, int i2){
        int m = arr[i1];
        if(i2 > i1){
            return -1;
        }
        else if(arr == null)return -1;
        for(int i = i1; i < i2; i++){
            if(m < arr[i]){
                m = arr[i];
            }
        }
        return m;
    }

    static void reverse(int[] arr){
        int j = arr.length-1;
        for(int i = 0; i < arr.length/2; i++){
            swap(arr,i,j);
            j--;
        }
    }
}
