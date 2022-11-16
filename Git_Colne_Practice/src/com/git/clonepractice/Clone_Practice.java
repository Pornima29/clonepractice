package com.git.clonepractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Clone_Practice {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "Shalini");
		hm.put(20, "Sandjya");
		
		 Set set =hm.keySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Object key = itr.next();
			System.out.println("key is :" +key);
			System.out.println("value is :" +hm.get(key));
		}

	}

}
