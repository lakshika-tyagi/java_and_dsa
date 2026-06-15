public class FindLargeInRotatedArray {
    static void main() {
        int[] arr = {4,5,6,7,9,10,11,2,3,4};
        int [] arr1 = {5,1,2,3,4};
        int [] arr2 = {3,1,2};
        int [] arr3 = {0,1,2,4,10,12,19,-4,-3,-2};
        int [] arr4 = {4,5,6,7,0,1,2,3};

        System.out.println(pivot(arr));
        System.out.println(pivot(arr1));
        System.out.println(pivot(arr2));
        System.out.println(pivot(arr3));
        System.out.println(pivot(arr4));


        int[] arr5 = {2,2,2,2,9,2};
        System.out.println(pivotWithDuplicates(arr5));

    }

//    not for duplicate values
    static int pivot(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1])return arr[mid];
            else if(arr[mid] > arr[start])start = mid + 1;
            else end = mid  ;
        }
        return arr[start];
    }

//    for duplicate values
    static int pivotWithDuplicates(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1])return arr[mid];
            if(arr[mid] < arr[mid-1])return arr[mid-1];

//            if elements at middle , start and equal are equal just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
//                NOTE : what if these are pivots ?

//                check if start is pivot
                if(arr[start] > arr[start+1])return start;
                start++ ;

//                check if end is pivot
                if(arr[end] < arr[end-1])return end - 1;
                end--;
            }
//            left side is sorted , pivot should be right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

}
