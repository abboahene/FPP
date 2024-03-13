package DataStructures.List;
import java.util.LinkedList;

public class MyDoublyLinkList {
    public static void main(String[] args) {
        MyDoublyLinkList list = new MyDoublyLinkList();
        list.addAtHead(9);
        list.deleteAtIndex(0);
        list.addAtTail(4);
        System.out.println(list.numberOfNodes);
        System.out.println(list);
        System.out.println("At index 0: "+ list.get(0));
        list.addAtHead(2);
        list.addAtTail(5);

    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int x) {val = x;}
    }

    int numberOfNodes;
    ListNode head, tail;
    public MyDoublyLinkList(){
        numberOfNodes = 0;
         head = new ListNode(0);
         tail = new ListNode(0);
         head.next = tail;
         tail.prev = head;
    }

    public void addAtIndex(int index, int val){
       if(index > numberOfNodes) return;
       if(index < 0) index = 0;
       ListNode pred, succ;
       if(index < numberOfNodes - index){
           pred = head;
           for(int i = 0; i < index; i++){
               pred = pred.next;
           }
           succ = pred.next;
       }else{
           succ = tail;
           for(int i = 0; i < numberOfNodes-index; i++){
               succ = succ.prev;
           }
           pred =  succ.prev;
       }
       ListNode toAdd = new ListNode(val);
       toAdd.prev = pred;
       toAdd.next = succ;
       pred.next = toAdd;
       succ.prev = toAdd;
       ++numberOfNodes;

    }
    public void addAtHead(int val){
        ListNode pred = head;
        ListNode succ = head.next;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        ++numberOfNodes;
    }

    public void addAtTail(int val){
        ListNode succ = tail;
        ListNode pred = tail.prev;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        ++numberOfNodes;
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index >= numberOfNodes){
            return;
        }
        ListNode pred = head;
        for(int i = 0; i < index; i++){
            pred = pred.next;
        }
        ListNode succ = pred.next.next;
        pred.next =  succ;
        succ.prev = pred;
        --numberOfNodes;
    }

    public int get(int index){
        if(index < 0 || index >= numberOfNodes){
            return -1;
        }
        ListNode curr = head;
        if(index + 1 < numberOfNodes - index){
            for(int i = 0; i < numberOfNodes - index; ++i){
                curr = curr.next;
            }
        }else {
            curr = tail;
            for(int i = 0; i < numberOfNodes - index; ++i){
                curr = curr.prev;
            }
        }
        return curr.val;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        ListNode pred = head;
        while(pred != null){
            sb.append(pred.val+" -> ");
            pred = pred.next;
        }
        sb.append("\b\b\b");
        return sb.toString();
    }
}
