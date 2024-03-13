package Assignments.Assignment5.Problem5;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("Dell", "Intel", 4, 100);
        Computer c2 = new Computer("Hp", "Intel", 8, 120);

        if(c1.equals(c2)){
            System.out.println("objects c1 and c2 are equal");
        }else {
            System.out.println("c1 and c2 are not equal");
        }
        int c1HashCode = c1.hashCode();
        int c2HashCode = c2.hashCode();
        System.out.println("c1HasCode: " + c1HashCode);
        System.out.println("c1HasCode: " + c2HashCode);
        if(c1HashCode == c2HashCode){
            System.out.println("c1 HasCode and c2HashCode are equal");
        }else{
            System.out.println("c1 HasCode and c2HashCode are not equal");
        }
        System.out.println();

    }
}
