public class EvenDigits {

    //    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    static void main() {

        int[] arr = {-18, 124, 9, 1764, 98, 10};

        System.out.println(findNumbers(arr));
        System.out.println(even(arr));

        for (int i : arr) {
            System.out.print(digits2(i) + " ");
        }

    }

    static int digits2(int num) {
        if (num < 0) num = (-1) * num;
        return (int) (Math.log10(num) + 1);
    }

    //time complexity : 1ms
    static int findNumbers(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            int n = findDigits(i);
            if (n % 2 == 0) ans++;
        }
        return ans;
    }

    static int findDigits(int i) {
        int sum = 0;
        while (i != 0) {
            sum++;
            i = i / 10;
        }
        return sum;
    }

    //    more time complexity : 7ms
    static int even(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            String str = "";
            str = i + str;
            if (str.length() % 2 == 0) ans++;
        }
        return ans;
    }

}
