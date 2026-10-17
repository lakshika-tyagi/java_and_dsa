package enumExamples;

public class Basic {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//        these above are enum constants
//        public , static and final
//        since it is final, you cannot create child enums
//        type is Week

        Week() {
            System.out.println("Constructor called for " + this.toString());
        }
//        this is not public or protected, only private or default
//        why ? we don't want to create new objects
//        this is not the enum concept

//        internally : public static final Week Monday = new Week();

        @Override
        public void hello() {
            System.out.println("hello");
        }
    }

    static void main() {
        Week week;
        week = Week.Monday;
        week.hello();

//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }
//
//        System.out.println(week.ordinal());
    }
}
