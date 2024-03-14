package Practice;

public class MyLinkedList {

    private class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
        }
    }

    Node head;
    int size = 0;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            size++;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        size++;
    }
    public void remove(int index){
        if(index < 0 || index > size - 1) return;
        int i = 0;
        Node curr = head;
        while(i != index - 1){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        size--;
    }
    public void insert(int data, int index){
        if( index < 0 || index > size -1 ) return;
        Node newNode = new Node(data);
        int i = 0;
        Node curr = head;
        while (i != index -1){
            curr = curr.next;
            i++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;

    }
    public int get(int index){
        if(index < 0 || index > size - 1) return -1;
        int i = 0;
        Node curr = head;
        while(i != index){
            curr = curr.next;
            i++;
        }
        return curr.data;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        if(curr == null) return "null";
        while(curr != null){
            sb.append(curr.data).append(" -> ");
            curr = curr.next;
        }
        sb.append("\b\b\b");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        MyLinkedList l2 = new MyLinkedList();
        l2.add(4);
        l2.add(5);
        l2.add(6);

        double sum1 = 0;
        for(int i = 0 ; i < l1.size; i++){
           double temp = l1.get(i) / Math.pow(10, l1.size - i);
           sum1 += temp;
        }
        sum1 = sum1 * Math.pow(10, l1.size);

        double sum2 = 0;
        for(int i = 0 ; i < l2.size; i++){
           double temp = l2.get(i) / Math.pow(10, l1.size - i);
           sum2 += temp;
        }
        sum2 = sum2 * Math.pow(10, l1.size);

        long res = (long) sum1 + (long) sum2;
        MyLinkedList resList = new MyLinkedList();

        while(res != 0){
            resList.add((int)res%10);
            res/=10;
        }

        System.out.println(resList);
    }

}
