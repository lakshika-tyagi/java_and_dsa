public class SearchInRotatedArray {
    static void main() {
        int[] arr = {4,5,7,0,1,2};
        int [] arr1 = {1};

        System.out.println(searchIndex(arr,10));
        System.out.println(searchIndex(arr,0));
        System.out.println(searchIndex(arr,3));
        System.out.println(searchIndex(arr1,0));

        int[] arr2 = {4,5,5,5,5,6,7,8,9,10,0,1,1,2};
        System.out.println(searchIndex(arr2,1));

    }

    static int findSmall(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        if(arr[0] < arr[end])return arr[0];
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[end])start = mid + 1;
            else  end = mid ;
        }
        return start;
    }

    static int binarySearch(int [] arr, int target, int start , int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)return mid;
            else if(arr[mid] > target)end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    static int searchIndex(int [] arr , int target){
        int start = 0;
        int mid = findSmall(arr);
        int end = arr.length - 1;
        int ans = binarySearch(arr,target,start,mid-1);
        if(ans == -1)ans = binarySearch(arr,target,mid,end);
        return ans;
    }
}
