package com.wbl.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistmethods {

	public static void main(String args[]){
		
		ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("tech1");
		al1.add("tech2");
		al1.add("tech3");
		al1.add("tech4");
		al1.add("tech5");
		al1.add("tech6");
		
		Iterator itr = al1.iterator();
		
		//while(itr.hasNext()){
	//		System.out.println(itr.next());
	//	}
	//	for(String s: al1)
	//	{
	//		System.out.println(s);
	//	}
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("ech1");
		al2.add("ech2");
		al2.add("ech3");
		al2.add("tech4");
		al1.removeAll(al2);
			
		for(String s: al1)
		{
			System.out.println(s);
		}
	}
}
