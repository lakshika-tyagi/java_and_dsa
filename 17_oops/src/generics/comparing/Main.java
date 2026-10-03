package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static void main() {
        Student kunal = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.52f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list = {kunal, rahul, arpit, karan, sachin};

        Arrays.sort(list);  //no effect
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(o1.rollno - o2.rollno);
//            }
//        });

        Arrays.sort(list, (o1, o2) -> -(o1.rollno - o2.rollno));

        System.out.println(Arrays.toString(list));

//        if (kunal.compareTo(rahul) > 0) {
//            System.out.println("Kunal has more marks");
//        } else {
//            System.out.println("Rahul has more marks");
//        }
    }
}
