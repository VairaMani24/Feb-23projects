package javaPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class OopsC2 implements Comparator{

	public static void main(String[] args) {

		String[] n= {"mani","ragul","jothi","deepak"};

		for(String i:n) {
			System.out.println(i);
		}

		System.out.println("************************normal sort****************************");

		Arrays.sort(n);

		for(String i:n) {
			System.out.println(i);
		}
		System.out.println("************Comparator*************");

		Comparator c=new OopsC2();

		Arrays.sort(n, c);
		for(String i:n) {
			System.out.println(i);
		}
	}

	@Override
	public int compare(Object o1, Object o2) {

		String s1=(String) o1;
		String s2=(String) o2;

		int i = s1.compareTo(s2);
		if(i>0)
			return -1;
		else if(i<0)
			return +1;
		else
			return 0;
	}

}
