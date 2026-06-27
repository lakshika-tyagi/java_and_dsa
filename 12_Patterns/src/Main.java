public class Main {
    static void main() {

        pattern31(6);

    }

    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
//            for every row, run the column
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i <= 2*n - 1 ; i++) {
            int cols = i<= n ? i : 2*n - i;
            for(int j = 1; j <= cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern17(int n){
        for (int i = 1; i <= 2*n - 1; i++) {
            int space = i <= n ? n - i : i - n;
            int c = i <= n ? i : 2*n - i;
            for (int s = 1; s <= space ; s++) {
                System.out.print(" ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= c ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int i = 1; i <= 2*n - 1; i++) {
            int space = (i <= n)? n-i : i-n;
            int stars = (i <= n) ? i : 2*n - i;
//            for space
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
//            for stars
            for(int j = 1; j <= stars; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern30(int n){
        for (int i = 1; i <= n ; i++) {
            for (int s = 1; s <= n - i ; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        for (int i = 1; i <= 2*n - 1; i++) {
            int num = (i <= n) ? n - i + 1 : i - n + 1;
            for (int j = n; j >= 1; j--) {
                int p = Math.max(num, j);
                System.out.print(p + " ");
            }
            for (int j = 2; j <= n ; j++) {
                int p = Math.max(num, j);
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}