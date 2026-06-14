public class FirstIndexInMountainArray {
    static void main() {

        int [] arr = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(3,arr));

        int [] arr2 = {1,5,2};
        System.out.println(findInMountainArray(2,arr2));

    }

    static int findInMountainArray(int target, int [] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target ){
                ans = mid;
                if(arr[mid] == arr[mid - 1])end = mid - 1;
                else if(arr[mid] == arr[mid+1])start = mid + 1;
            }
            else if(arr[mid] > arr[mid+1] ){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;

    }
}
