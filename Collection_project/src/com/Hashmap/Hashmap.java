package com.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap {
	public static void main (String[]arg) {
		//no order no index
		//store values in from of key and values
		//key cannot be duplicate
		//can store n number of null values but only one null key
		//hash map is not thread safe.
	
		HashMap<String,String>captialmap=new HashMap<String,String>();
		captialmap.put("India","Delhi");
		captialmap.put("usa", "washinton");
		captialmap.put("uk","londo");
		captialmap.put("germany","paris");
		captialmap.put(null,"berlin");
		captialmap.put(null,"la");
		captialmap.put("france", null);
		
		System.out.println(captialmap.get("India"));
		System.out.println(captialmap.get(null));
		System.out.println(captialmap.get(null));
		System.out.println(captialmap.get("france"));
		
		//iterator
		Iterator<String> it = captialmap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String values = captialmap.get(key);
			System.out.println("key="+ key + "values=" + values  );
			System.out.println("key=" + key);
		}
		//iterator over the set by using entryset
		Iterator<Entry<String, String>> it1 = captialmap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("key= " + entry.getKey() + " and values = " + entry.getValue());
		}
		
		
		
		
	}
}


