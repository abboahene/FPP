public class Recursion {


    public static void main(String[] args) {
        countDown(7);
        System.out.println(len("ORANGE"));
        reverseChars("ORANGE");
        System.out.println(fact(4));
    }
    public static int len(String str){
        if(str == null || str.equals("") ) return 0;
        return 1 + len(str.substring(1));
    }

    public static void countDown(int num){
        if(num <= 0) {
            System.out.println("End");
            return;
        };
        System.out.println(num);
        countDown(num-1);
    }

    public static void reverseChars(String str){
        if(str == null || str.equals("")) return;
        reverseChars(str.substring(1));
        System.out.print(str.charAt(0));
    }

    public static int fact(int n){
        if(n == 0 || n ==1) return 1;
        return fact(n-1) * n;
    }
}
