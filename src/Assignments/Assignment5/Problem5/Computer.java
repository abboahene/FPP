package Assignments.Assignment5.Problem5;

import java.util.Objects;

public class Computer {
   private String manufacturer;
   private String processor;
   private int ramSize;
   private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    int getRamSize() {
        return ramSize;
    }
    double getProcessorSpeed(){
        return processorSpeed;
    }
    double computePower(){
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "{manufacturer: "+ manufacturer +
                ", processor: " + processor +
                ", ramSize: " + ramSize +
                ", processorSpeed: "+ processorSpeed +
                "}";
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Computer comp = (Computer) obj;
        return manufacturer.equals(comp.manufacturer)
                && processor.equals(comp.processor)
                && ramSize == comp.ramSize
                && Math.round(processorSpeed) == Math.round(comp.processorSpeed);
    }
}
