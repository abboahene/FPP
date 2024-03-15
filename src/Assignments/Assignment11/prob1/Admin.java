package Assignments.Assignment11.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> sMap = new HashMap<>();
		for(Student s : students){
			Key key = new Key(s.getFirstName(), s.getLastName());
			sMap.put(key, s);
		}
		return sMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
               //implements
		double sum = 0;
		for(Map.Entry<Key, Student> item : maps.entrySet()){
			sum += item.getValue().getGpa();
		}
		return sum/ maps.size();
}
}
