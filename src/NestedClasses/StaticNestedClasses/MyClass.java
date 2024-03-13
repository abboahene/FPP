package NestedClasses.StaticNestedClasses;

public class MyClass {

    private String s = "hello";

    public static void main(String[] args){
        new MyClass();
    }

    MyClass(){
        //access static methos in the usual way
        MyStaticNestedClass.myStaticMethod();
        // access instance methods in the usual way too
        // except that now private methods are also accessible
        MyStaticNestedClass cl = new MyStaticNestedClass();
        cl.myOtherMethod();

        // as with inner classes, private instance variable are accessible
        int y = cl.x;
    }

    static class MyStaticNestedClass{
        private int x = 0;

        static void myStaticMethod(){
            //compiler error -- no access
            //String t = s;
        }

        private void myOtherMethod(){

        }
    }

}
