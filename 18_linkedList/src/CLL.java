public class CLL {

    private Node head;
    private Node tail;

    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.println("HEAD");
    }

    public void delete(int val){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        Node node = head;
        Node pNode = head;
        do{
            if(node.val == val){
                pNode.next = node.next;
                return;
            }
            pNode = node;
            node = node.next;
        }while(node != head);
        System.out.println("value does not exist");
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
