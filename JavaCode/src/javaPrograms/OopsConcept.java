package javaPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class OopsConcept implements Comparator{

	public static void main(String[] args) {

		//Ascending order for sorting
		Integer [] a= {4,5,89,158,25,97};
		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("*****************NORMAL SORT************************");
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}


		System.out.println("******************COMPARATOR SORT********************************");

		// Descending order for sorting

		Comparator n=new OopsConcept();

		Arrays.sort(a, n);

		for (int i : a) {
			System.out.println(i);
		}

	}

	@Override
	public int compare(Object a, Object b) {
		
		Integer s1=(Integer) a;
		Integer s2 =(Integer) b;
		int i = s1.compareTo(s2);
		
		if(i>0)
			return -1;
		else if(i<0)
			return +1;
		else
			return 0;
					

	}

}
