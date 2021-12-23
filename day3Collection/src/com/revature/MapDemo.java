package com.revature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map myMap = new HashMap();

		myMap.put(1, "USA");
		myMap.put(2, "EUROPE");
		myMap.put(3, "Italy");
		myMap.put(4, "China");
		myMap.put(5, "India");
		myMap.put(6, "Singapore");
		myMap.put(6, "China");
		
		System.out.println(myMap);
		Set keys = myMap.keySet();
		
		for (Object obj : keys) {
			System.out.println(obj);
			System.out.println(myMap.get(obj));
			
		}
		
		Iterator itr = keys.iterator();
		
		while (itr.hasNext()) {
			int k = (int) itr.next();
			System.out.println("key=" +k + " value="+ myMap.get(k));
		}
		
	}

}
