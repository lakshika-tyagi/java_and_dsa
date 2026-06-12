public class NextGreaterElement {

//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    static void main() {

        char [] arr = {'c', 'f', 'j'};
        System.out.println(nextGreater(arr,'d'));
        System.out.println(nextGreater(arr,'c'));
        System.out.println(nextGreater(arr,'a'));
        System.out.println(nextGreater(arr,'j'));

        char[] arr2 = {'e','e','e','e','e','e','n','n','n','n'};
        System.out.println(nextGreater(arr2,'e'));


    }

    static char nextGreater(char [] arr, char key){
        int low = 0;
        int high = arr.length -1;
        if(arr[high] <= key || key < arr[low]) return arr[low];
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > key) high = mid-1;
            else low = mid + 1 ;
        }
        return arr[low];
    }
}
