public class FloorOfANumber {
    static void main() {

        int [] arr = {2,3,5,9,14,16,23};
        System.out.println(floorNumber(arr,25));
        System.out.println(floorNumber(arr,24));
        System.out.println(floorNumber(arr,22));
        System.out.println(floorNumber(arr,20));
        System.out.println(floorNumber(arr,17));
        System.out.println(floorNumber(arr,15));
        System.out.println(floorNumber(arr,13));
        System.out.println(floorNumber(arr,10));
        System.out.println(floorNumber(arr,8));
        System.out.println(floorNumber(arr,6));
        System.out.println(floorNumber(arr,4));
        System.out.println(floorNumber(arr,3));
        System.out.println(floorNumber(arr,0));

    }
    static int floorNumber(int [] arr, int target){
        int low = 0;
        int high = arr.length-1;
        if(target < arr[0])return -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target)return arr[mid];
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return arr[high];
    }
}
