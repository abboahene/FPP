package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyStringList {

    private String[] arr;
    private int numOfElemets;

    final int INITIALS_LENGHT = 4;

    MyStringList(){
        arr = new String[INITIALS_LENGHT];
        numOfElemets = 0;
    }

    public String get(int index) {
        if(index < 0 || index > numOfElemets - 1) {
            System.out.println("Index out of bounds");
            return null;
        }
        return arr[index];
    }
    public void add(String s){
        if(s == null) return;
        if(numOfElemets == arr.length) resize();
        arr[numOfElemets] = s;
        numOfElemets++;
    }
    public void remove(int index){
        String[] temp = new String[arr.length];
        System.arraycopy(arr, 0, temp, 0, index);
        System.arraycopy(arr, index + 1, temp, index, arr.length - (index + 1));
        arr = temp;
        numOfElemets--;
    }
    public void insert(int index, String s){
        if(s == null) return;
        if(index < 0 || index > numOfElemets - 1) return;
        if(numOfElemets == arr.length) resize();
        String[] temp = new String[arr.length + 1];
        System.arraycopy(arr, 0, temp, 0, index);
        temp[index] = s;
        System.arraycopy(arr, index, temp, index + 1, arr.length - index);
        arr = temp;
        numOfElemets++;
    }

    public boolean find(String s){
        if( s == null) return false;
        for(String str : arr){
            if(s.equals(str)){
                return true;
            }
        }
        return false;
    }
    public boolean isEmpty(){
        return numOfElemets == 0;
    }
    private void resize(){
        String[] temp = new String[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    public String toString(){
        if(numOfElemets == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < numOfElemets; i++){
            sb.append(arr[i]).append(", ");
        }
        sb.append("\b\b]");
        return sb.toString();
    }


}
