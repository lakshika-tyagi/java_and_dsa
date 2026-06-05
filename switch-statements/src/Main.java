import java.util.Objects;
import java.util.Scanner;

class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

//        String fruit = in.next();
//        switch (fruit) {
//            case "mango" -> {
//                System.out.println("King of fruits");
//                System.out.println("King of fruits");
//            }
//            case "apple" -> System.out.println("A sweet red fruit");
//            case "orange" -> System.out.println("Round fruit");
//            case "grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }

////        display day names
//        int day = in.nextInt();
//        switch(day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Enter a valid day number");
//        }
//
////        display week and weekend
//        switch(day) {
//            case 1,2,3,4,5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//            default -> System.out.println("Enter a valid day number");
//        }

//        nested switch
        int empId = in.nextInt();
        String dept = in.next();

        switch(empId) {
            case 1 :
                System.out.println("Lakshika Tyagi");
                break;
            case 2 :
                System.out.println("Another name");
                break;
            case 3 :
                System.out.println("Emp num 3");
                switch(dept) {
                    case "it":
                        System.out.println("It dept.");
                        break;
                    case "management":
                        System.out.println("Management dept.");
                        break;
                    default :
                        System.out.println("No dept. entered");
                }
                break;
            default :
                System.out.println("Enter valid id");
        }
    }

}