public class DLL {

    private Node head;
    private int size ;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head != null)head.prev = node;
        node.next = head;
        node.prev = null;
        head = node;
        size++;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
        last = node;
    }


    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
