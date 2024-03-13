package NestedClasses.NonStaticNestedClasses.AnonymousNestedClasses;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota") {
            String modelName = "Model Y";

            public String getModelName() {
                return modelName;
            }

            public void setModelName(String modelName) {
                this.modelName = modelName;
            }

            public void printSomething(){
                System.out.println("Vehicle "+ name);
            }
        };
    }
}
