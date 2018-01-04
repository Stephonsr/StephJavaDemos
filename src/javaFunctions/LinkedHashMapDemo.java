package javaFunctions;

import java.util.LinkedHashMap;
import java.util.Map;

//Returns true if this map should remove its eldest entry.
//Java Program demonstrate use of LinkedHashMap:
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		//Here Insertion order maintains 
				Map<Integer, String>lmap = new LinkedHashMap<Integer, String>();
				lmap.put(12, "Nicky");
				lmap.put(5, "Cardi");
				lmap.put(23, "Remy");
				lmap.put(9, "Trina");
				System.out.println("LinkedHashMap before modification" + lmap);
				System.out.println("Is Employee ID 12 exists: " +lmap.containsKey(12));
				System.out.println("Is Employee name Amit Exists: "+lmap.containsValue("Amit"));
				System.out.println("Total number of employees: "+ lmap.size());
				System.out.println("Removing Employee with ID 5: " + lmap.remove(5));
				System.out.println("Removing Employee with ID 3 (which does not exist): " + lmap.remove(3));
				System.out.println("LinkedHashMap After modification" + lmap);
			}
		
	}

