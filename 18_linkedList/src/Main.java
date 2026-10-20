public class Main {
    static void main() {

        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.insertLast(99);

        list.insert(100,3);
        list.insert(23,6);


        list.display();

        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.delete(4));
        System.out.println();
        System.out.println(list.find(2));

        list.display();
    }
}
