package DataStructures.HashTable;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashtable {
    private int numberOfElements;
    private static final int INITIAL_SIZE = 19;
    private int tableSize;
    // To avoid collision with same index, every index is implemented with LinkedList
    private LinkedList[] table;
    public MyHashtable(){
        this(INITIAL_SIZE);
    }
    public MyHashtable(int tableSize){
        this.tableSize = tableSize;
        table = new LinkedList[tableSize];
    }
    // First Try
    public void put(Object key, Object value){

        if(key == null) return;
        //-------class code
        //disallow null keys
        if(key == null) return;
        // get the "big" integer corresponding to the object
        //assumes key is not null
        int hashcode = key.hashCode();
        //compress down to a table slot
        int hashValue = hash(hashcode);
        //create the entry

//        //-------my code
//        if(table[hashValue] == null) {
//            table[hashValue] = new LinkedList<>();
//        }
//
//        for(Object ob: table[hashValue]){
//            Entry entry = (Entry) ob;
//            if(entry.key.equals(key)){
//                entry.value = value;
//            }
//        }
//        Entry e = new Entry(key, value);
//        table[hashValue].add(e);
//        numberOfElements++;
//        //-------my code

        Entry e = new Entry(key, value);
        boolean keyAlreadyInUse = false;
        if(table[hashValue] != null){
            for(Object ob : table[hashValue]){
                Entry ent = (Entry) ob;
                if(ent.key.equals(key)){
                    keyAlreadyInUse = true;
                    ent.value = value; // update vlaue for this Entry
                    return;
                }
            }
        }
        // we handled case keyAlreadyInuse == ture in loop
        if(!keyAlreadyInUse){
            //now place it in the table
            if(table[hashValue] == null){
                table[hashValue] = new LinkedList();
            }
            table[hashValue].add(e);
            numberOfElements++;
        }
    }

    public Object get(Object key){
        //null key not allowed
        if(key == null) return null;
        // get the "big" integer corresponding to the object
        int hashcode  = key.hashCode();
        //compress down to a table slot
        int hashValue = hash(hashcode);
        //if slot given by has not yet in use, return ull
        if(table[hashValue] == null) return null;
        //now look for the desire Entry, each index is a linked list,
        //so Iterator is used to retrieve the correct match
        Entry e = null;
        for(Iterator it = table[hashValue].iterator(); it.hasNext();){
            e = (Entry) it.next();
            if(e.key.equals(key)){
                return e.value;
            }
        }
        return null;
    }

    public String toString(){
        String n = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < table.length; i++){
            if(table[i] != null){
                sb.append("Ined["+i+"]"+" ");
                Entry next = null;
                for(Iterator it = table[i].iterator(); it.hasNext();){
                    next = (Entry) it.next();
                    if(next.value != null){
                        sb.append(next + n);
                    }else{
                        sb.append(next.key + "-> null"+n);
                    }
                }
            }
        }
        return sb.toString();
    }
    private int hash(int bigNum){
        bigNum = Math.abs(bigNum);
        return bigNum % tableSize;
    }

    public int size() {
        return numberOfElements;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    private class Entry {
        private Object key;
        private Object value;

        Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return key.toString() + "->" + value.toString();
        }
    }

}
