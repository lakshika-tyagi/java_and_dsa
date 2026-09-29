package generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "," + rollno + "  ";
    }

    @Override
    public int compareTo(Student o) {
//        int diff = (int) (this.marks - o.marks);
////        if diff = 0 , both equal
////        if diff < 0 , o is bigger
////        else o is smaller
//        return diff;
        return 0;
    }
}
