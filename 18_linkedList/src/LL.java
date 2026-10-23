import java.util.LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        if(index > size){
            System.out.println("Index out of bounds");
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

//    insert using recursion
    public void insertRec(int val ,int index){

    }
    private Node insertRec(int val,int index , Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        insertRec(val,index--,node.next);
        return node;
    }

    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if(temp.value == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        if (head == null){
            return -1;
        }
        int val = head.value;
        head = head.next;
        if(head == tail){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if (head == null){
            return -1;
        }
        if(size <= 1){
            return deleteFirst();
        }
        int val = tail.value;
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return val;
    }

    public int delete(int index){
        if(index > size){
            System.out.println("index out of bounds");
            return -1;
        }
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();

        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node del = temp.next;
        int val = del.value;
        temp.next = del.next;
        return val;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}