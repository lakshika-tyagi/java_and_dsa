public class RotationCount {
    static void main() {
        int[] arr = {3,4,5,1,2};
        System.out.println(count(arr));

        int[] arr1 = {4,5,6,7,0,1,2};
        System.out.println(count(arr1));

        int[] arr2 = {11,13,15,17};
        System.out.println(count(arr2));

    }

    static int count(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end -start)/2;
            if(arr[mid] > arr[end])start = mid + 1;
            else end = mid;
        }
        if(start == 0)return arr.length;
        return start;
    }
}
