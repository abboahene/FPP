package Assignments.Assignment6;

public class MyTable {
   private Entry[] entries = new Entry[26];

   public void add(char c, String s) throws IndexOutOfBoundsException{
       int index = ((int) c) - 96 - 1;
       if(index < 0 || index >= entries.length){
           throw new IndexOutOfBoundsException();
       }else{
           entries[index] = new Entry(c, s);
       }
   }

   public String get(char c) throws IndexOutOfBoundsException{
       int index = ((int) c) - 96 - 1;
       if(index < 0 || index >= entries.length){
           throw new IndexOutOfBoundsException();
       }
       return entries[index].s;
   }

   public String toString(){
       StringBuilder str = new StringBuilder();
       for(Entry e: entries){
           if(e != null)
               str.append(e);
       }
       return str.toString();
   }

    private class Entry{
        private char c;
        private String s;

        Entry(char c, String s)  {
            this.c = c;
            this.s = s;
        }

        @Override
        public String toString() {
            return c + "->" + s + "\n";
        }
    }
}
