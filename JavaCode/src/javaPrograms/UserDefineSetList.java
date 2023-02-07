package javaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class UserDefineSetList {
	public static void main(String[] args) {
		
		HashMap hp=new HashMap<>();                                 
		                                             
		hp.put(102, "vaira");                      
		hp.put(107, "mani");
		hp.put(102, "manu");
		hp.put(105, "ragul");
		hp.put(101, "mani");
		hp.put(106, "jothi");
		hp.put(103, "janu");                       
		hp.put(109,"deepak");
		
			System.out.println(hp);
			
			boolean containsValue = hp.containsValue("mani");
			boolean containsKey = hp.containsKey(102);
			System.out.println(containsValue+"     "+containsKey);
			Object object = hp.get(102);
			System.out.println(object);
			Set keySet = hp.keySet();
			System.out.println(keySet);
			Collection values = hp.values();
			System.out.println(values);
			
			System.out.println(hp.remove(109));
			System.out.println(hp);
			
			Set entrySet = hp.entrySet();
			System.out.println(entrySet);
			
		for (Object ob : entrySet) {
			Map.Entry mp=(Map.Entry) ob;
			//System.out.println(ob);
			Object key = mp.getKey();
			System.out.println(key);
	Object value = mp.getValue();
	System.out.println(value);
			
			
			
		}
		
		
			
			
			
			
			
			
			
			
			
			
			
			
		
}
}