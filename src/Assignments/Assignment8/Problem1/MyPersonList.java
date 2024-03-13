package Assignments.Assignment8.Problem1;

import java.util.Arrays;

public class MyPersonList {

    public static void main(String[] args) {
        MyPersonList sl  =  new MyPersonList();
        Person p1 = new Person("Kwab", "Bob", 23);
        Person p2 = new Person("Twab", "Tob", 23);
        Person p3 = new Person("Xwab", "Cob", 23);
        sl.add(p1);
        sl.add(p2);
        sl.insert(p3, 0);
        System.out.println("Find: " + sl.find("Xwab"));
        System.out.println("At index 3: " + sl.get(1));
        sl.remove("Xwab");

        System.out.println(sl);

    }

    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;

    public MyPersonList(){
        currentArray = new Person[INITIAL_LENGTH];
        numOfElements = 0;
    }

    //Add element in last
    public void add(Person s){
        if(s == null) return;
        if(numOfElements == currentArray.length){
            resize();
        }
        //currentArray[numOfElements++] = s;
        currentArray[numOfElements] = s;
        numOfElements = numOfElements + 1;
    }

    public boolean remove(String ln){
        int index = -1;
        for(int i = 0; i < numOfElements; i++){
            if(currentArray[i].getLast().equals(ln)) index = i;
        }
        if(index == -1) return false;

        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --numOfElements;
        return true;
    }

    public void insert(Person p, int pos){
        if(p == null) return;
        if(pos > numOfElements || pos < 0) return;
        if(numOfElements == currentArray.length) resize();
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp,0, pos);
        temp[pos] = p;
        System.arraycopy(currentArray, pos, temp,pos +1, currentArray.length - (pos +1));
        currentArray = temp;
        ++numOfElements;
    }

    public Person get(int i){
        if(i < 0 || i >= numOfElements) return null;
        return currentArray[i];
    }

    private void resize(){
        System.out.println("resizing");
        int len = currentArray.length;
        int newlen = 2 * len;
        Person[] newArray = new Person[newlen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public boolean isEmpty(){
        return numOfElements == 0;
    }

    public boolean find(String ln){
        if(ln.isEmpty()) return  false;
        for(int i = 0; i < numOfElements; i++){
            if(currentArray[i].getLast().equals(ln)) return true;
        }
        return  false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < numOfElements - 1; ++i){
            sb.append("{Name: " + currentArray[i].getLast() + "}");
        }
        sb.append(currentArray[numOfElements - 1]+ "]");
        return  sb.toString();
    }

    public Object clone(){
        Person[] temp = Arrays.copyOf(currentArray, numOfElements);
        return temp;
    }
}
