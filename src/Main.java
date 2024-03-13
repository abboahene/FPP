public class Main {
    public static void main(String[] args) {
       Singleton s =  Singleton.getInstance();
       Singleton s1 =  Singleton.getInstance();
       Singleton s2 =  Singleton.getInstance();
       Singleton s3 =  Singleton.getInstance();

        System.out.println(s1.hashCode() + " "+s2.hashCode() + " "+s3.hashCode());
    }
}