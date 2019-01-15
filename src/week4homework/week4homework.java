package week4homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week4homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Create an instance of an ArrayList of String called employeeNames
		 */
		
		ArrayList<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Craig");
		employeeNames.add("Pam");
		employeeNames.add("Dwight");
		employeeNames.add("Micheal");
		employeeNames.add("Kevin");

		/*
		 * Create an instance of a HashSet of the  Integer called ids
		 */
		
		HashSet<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);

		/*
		 * Create an instance of  HashMap of Integer, String called emloyeeMap
		 */
		
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(1, "Craig");
		employeeMap.put(2, "Pam");
		employeeMap.put(3, "Dwight");
		employeeMap.put(4, "Micheal");
		employeeMap.put(5, "Kevin");
		
	
		
		for (String employees : employeeNames) {
			employeeMap.put(6, "Kayla");
			System.out.println(employeeNames);
			
			}
		
		for (Map.Entry<Integer, String> employee : employeeMap.entrySet()) {
			System.out.println( " " + employee.getKey() + " " + employee.getValue());
			
			/*
			 * Create a StringBuider called idsBuilder
			 */
			StringBuilder idsBuilder = new StringBuilder();
				for (Integer id : ids) {
			    idsBuilder.append(id + "-");
			    System.out.println(idsBuilder.toString());
			    
			StringBuilder namesBuilder = new StringBuilder();
			    for (String employeeName : employeeNames) {
			    	namesBuilder.append(employeeName + " ");
			    	System.out.println(namesBuilder.toString());
			   
			    }
			}
		}
	}

}	


