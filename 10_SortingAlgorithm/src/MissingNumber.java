public class MissingNumber {
    static void main() {

    }
    static void sortArray(int [] arr){
        int n = arr.length;
        int i = 0;
        while(i < n){
            if(arr[i] == n || arr[i] == i){
                i++;
            }
            else{
                int req_idx = arr[i];
                int temp = arr[i];
                arr[i] = arr[req_idx];
                arr[req_idx] = temp;
            }
        }
    }


}
