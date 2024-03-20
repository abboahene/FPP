package Practice;

public class Main {
    public static void main(String[] args) {
        System.out.println("MyStringList------------");
        MyStringList msl = new MyStringList();

        msl.add("a");
        msl.add("b");
        msl.add("c");
        msl.add("d");
        msl.add("e");
        msl.add("f");
        msl.add("g");
        msl.insert(0, "h");
        msl.insert(1,"i");
        msl.insert(2,"j");
        msl.insert(3,"k");
        msl.insert(4,"l");
        msl.insert(5,"m");
        msl.insert(6,"n");
        msl.remove(1);
        msl.remove(1);
        msl.remove(1);
        msl.remove(1);
        msl.remove(1);
        msl.remove(1);
        msl.remove(1);

        msl.insert(1, "q");
        System.out.println(msl.find("b"));
        System.out.println(msl);

        System.out.println("MyLinkedList------------");
        MyLinkedList mll = new MyLinkedList();
        mll.add(1);
        mll.add(5);
        mll.add(3);
        mll.add(3);
//        mll.insert(4, 2);
        mll.insert(3, 2);
        System.out.println(mll);


    }
}
