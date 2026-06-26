public class PrettyPrinting {
    static void main() {
        float a = 143.1234f;
        System.out.printf("Formatted number is %.2f%n",a);

        System.out.println(Math.PI);
        System.out.printf("Pi : %.3f\n",Math.PI);

        System.out.printf("My name is %s and I am %s.\n","Lakshika Tyagi","cool");

        Integer num = 999;
        System.out.printf("hex value of 999 is : %x\n",num.hashCode());
        System.out.printf("Octal value of %d is %o\n",num,num);

        Date today = new Date();
        System.out.printf("Current date and time : %tc\n",today);

    }
}
