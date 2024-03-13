package Reflection;

import java.util.Objects;

public class Company {
    private final String name;
    private int numOfEmployees;
    public Company(String name, int numOfEmployees){
        this.name = name;
        this.numOfEmployees = numOfEmployees;
    }

    public String getName(){
        return name;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    private void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    public static void internalRules(){
        System.out.println("This is the internal rules.");
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", numOfEmployees=" + numOfEmployees +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(obj == null || obj.getClass() != getClass()) return false;
        Company comp = (Company) obj;
        return Objects.equals(name, comp.name) && numOfEmployees == comp.numOfEmployees ;
    }

    @Override
    public int hashCode(){
      return  Objects.hash(name, numOfEmployees);
    }
}
