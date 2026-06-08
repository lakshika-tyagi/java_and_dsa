public class Conditionals{
    static void main() {
        int salary = 25400;
        if(salary > 10000){
            salary = salary + 2000;
        } else if (salary > 5000) {
            salary += 1500;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
