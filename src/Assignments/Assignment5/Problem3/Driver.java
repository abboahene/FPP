package Assignments.Assignment5.Problem3;

public class Driver {
    public static void main(String[] args) {
        UpwardHat uh1 = new UpwardHat();
        UpwardHat uh2 = new UpwardHat();
        DownwardHat dh1 = new DownwardHat();
        FaceMaker fm1 = new FaceMaker();
        Vertical v1 = new Vertical();
        Figure[] figures = new Figure[5];
        figures[0] = uh1;
        figures[1] = uh2;
        figures[2] = dh1;
        figures[3] = fm1;
        figures[4] = v1;

        //print figures
        for(Figure f: figures){
            f.getFigure();
            System.out.print(" ");
        }
        System.out.println();
        //print figures with classes
        for(Figure f: figures){
            System.out.print(f.getClass().getSimpleName()+" : ");
            f.getFigure();
            System.out.println();
        }
    }
}
