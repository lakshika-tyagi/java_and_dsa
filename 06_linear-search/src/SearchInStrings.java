import java.util.Arrays;

public class SearchInStrings {
    static void main() {
        String name = "Lakshika Tyagi";
        char ch1 = 'j';
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(linearSearch(name, ch1));
        System.out.println(linearSearch1(name, ch1));
        System.out.println(linearSearch2(name, ch1));

        char ch2 = 'a';
        System.out.println(linearSearch(name, ch2));
        System.out.println(linearSearch1(name, ch2));
        System.out.println(linearSearch2(name, ch2));
    }

    //    search element and return index
    static int linearSearch(String str, char ch) {
        if (str.isEmpty()) return -1;
        else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) return i;
            }
            return -1;
        }
    }


    //    search element and return true/false
    static boolean linearSearch1(String str, char ch) {
        if (str.length() == 0) return false;
        else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) return true;
            }
            return false;
        }
    }


    //    search element and return element
    static char linearSearch2(String str, char ch) {
        if (str.isEmpty()) return '\0';
        else {
            for (char i : str.toCharArray()) {
                if (i == ch) return ch;
            }
            return '\0';
        }
    }

}  
