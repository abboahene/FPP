package DataStructures.List;

public class MyLinkedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    int size;
    ListNode head;
    public MyLinkedList(){
        size = 0;
        head = new ListNode(0);
    }

    public void addAtIndex(int index, int val){
        if(index > size) return;
        if(index < 0) index = 0;
        ListNode pred = head;
        for(int i = 0; i < index; i++){
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
        ++size;
    }

    public int get(int index){
        if(index < 0 || index >= size) return -1;
        ListNode curr = head;
        for(int i = 0 ; i < index + 1; i++){
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val){
        addAtIndex(0, val);
    }

    public void addAtTail(int val){
        addAtIndex(size, val);
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index >= size) return;
        ListNode pred = head;
        for(int i = 0 ; i < index; i++) pred = pred.next;
        pred.next = pred.next.next;
        size--;
    }

    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.addAtHead(800);
        l.addAtHead(300);
        l.addAtTail(900);
        l.addAtIndex(1, 200);
        l.get(1);
        l.deleteAtIndex(2);
        l.deleteAtIndex(1);
    }
}
