package Assignments.Assignment5.Problem2;

public class Professor extends DeptEmployee {

    private int numberOfPublications;

    public Professor(String name, double salary, int numberOfPublications, int year, int month, int day) {
        super(name, salary, year, month, day );
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
