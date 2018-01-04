package javaFunctions;

import java.util.HashMap;
import java.util.Map;
//This is used to initialize HashMap with capacity and custom load factor.
public class EmployeeSalaryStoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Below Line will create HashMap with initial size 10 and 0.5 load factor
		Map<String, Integer> empSal = new HashMap<String, Integer>(10, 0.5f);
		// Adding employee name and salary to map
		empSal.put("Robert", 10000);
		empSal.put("Steph", 20000);
		empSal.put("Meech", 30000);
		empSal.put("Tyrone", 1000);
		empSal.put("Pat", 15000);
		empSal.put("Tim", 10000); // Duplicate Value also allowed but Keys should not be duplicate
		empSal.put("Jada", null); // Value can be null as well
		System.out.println("Original Map: " + empSal);// Printing full Map
		// Adding new employee the Map to see ordering of object changes
		empSal.put("Robby", 23000);
		// Removing one key-value pair
		empSal.remove("Jada");
		System.out.println("Updated Map: " + empSal);// Printing full Map
		// Printing all Keys
		System.out.println(empSal.keySet());
		// Printing all Values
		System.out.println(empSal.values());

	}

}
