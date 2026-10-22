public class Main {
    static void main() {

//        LL list = new LL();
//
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//
//        list.insertLast(99);
//
//        list.insert(100,3);
//        list.insert(23,6);
//
//
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.delete(4));
//        System.out.println();
//        System.out.println(list.find(2));
//
//        list.display();


//        DLL list2 = new DLL();
//        list2.insertFirst(3);
//        list2.insertFirst(2);
//        list2.insertFirst(8);
//        list2.insertFirst(17);
//
//        list2.insertLast(23);
//        list2.insertLast(45);
//
//        list2.insert(45,65);
//
//        list2.display();


        CLL list3 = new CLL();
        list3.insertLast(23);
        list3.insertLast(3);
        list3.insertLast(19);
        list3.insertLast(75);
        list3.insertLast(8);
        list3.insertLast(5);

        list3.delete(23);
        list3.delete(5);
        list3.delete(75);
        list3.delete(99);

        list3.display();
    }
}
