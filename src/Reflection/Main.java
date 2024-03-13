package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Company comp = new Company("Veridian Solutions", 24000);
        Class compClass = comp.getClass();
        System.out.println("Name of the class with package name");
        System.out.println("Name of the class: " + compClass.getSimpleName());

        Field[] companyFields = compClass.getDeclaredFields();
        for(Field field: companyFields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(comp, "NexGen Innovations");

            }
        }
        System.out.println("Name of the company: " + comp.getName());


        Method[] compMethods = compClass.getDeclaredMethods();
        for(Method method: compMethods){
            if(method.getName().equals("setNumOfEmployees")){
                method.setAccessible(true);
                method.invoke(comp, 25000);
            }else if(method.getName().equals("internalRules")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }
        System.out.println("Number of employees: "+ comp.getNumOfEmployees());
    }


}
