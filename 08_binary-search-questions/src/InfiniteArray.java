public class InfiniteArray {
    static void main() {

        int [] arr = {2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                17, 18, 19, 20, 21, 22, 23, 24, 25, 27, 28, 29,
                34, 38, 39, 40, 41, 42, 43, 44, 45, 46, 50,51,55,59,60,64,68,69,75};
        System.out.println(range(arr,39));
        System.out.println(range(arr,30));
        System.out.println(range(arr,13));
        System.out.println(range(arr,21));
        System.out.println(range(arr,51));
        System.out.println(range(arr,75));
        System.out.println(range(arr,77));
    };

    static int range(int [] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int temp = start + 1;
            end = end + (end - start + 1)*2;
            if(end >= arr.length){
                end = arr.length - 1;
                break;}
            start = temp;
        }
        int ans = binarySearch(arr, start, end, target);
        return ans;
    }

    static int binarySearch(int [] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
