package Assignments.Assignment8.Problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Marketing m1 = new Marketing("Employee1", "product1", 1000);
        Marketing m2 = new Marketing("Employee2", "product2", 2000);
        Marketing m3 = new Marketing("Employee3", "product3", 3000);
        List<Marketing> mList = new ArrayList<>();
        mList.add(m1);
        mList.add(m2);
        mList.add(m3);
        mList.remove(1);
        System.out.println("Size: "+ mList.size());

        System.out.println("Unsorted: \n"+ mList);

        mList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return Double.compare(o1.getSalesamount(), o2.getSalesamount());
            }
        });
        System.out.println("Sorted: \n"+ mList);

        mList = listMoreThan1000(mList);

        mList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return o1.getEmployeename().compareTo(o2.getEmployeename());
            }
        });
        System.out.println("Sorted and More than 1000: \n"+ mList);

    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        List<Marketing> filtered = new ArrayList<>();
        for(Marketing m : list){
            if(m.getSalesamount() > 1000){
                filtered.add(m);
            }
        }
        return filtered;
    }
}
