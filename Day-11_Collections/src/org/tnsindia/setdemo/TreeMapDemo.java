package org.tnsindia.setdemo;

import java.util.Map;
import java.util.NavigableMap;
//import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		//TreeMap does not contain null key but it contains many null value
		//SortedMap<String,String>obj=new TreeMap<>();
		NavigableMap<String,String>obj=new TreeMap<>();
		obj.put("Parikshit", "Student");
		obj.put("Mohan", "Doctor");
		obj.put("Vikas", "Engineer");
		obj.put("Sandip", null);
		System.out.println(obj);
		//to extract the pairs from map
		for(@SuppressWarnings("rawtypes") Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(obj.firstEntry());
		System.out.println(obj.lastEntry());
		System.out.println(obj.lastKey());


	}

}
