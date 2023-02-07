package javaPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayAscendingClass implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a= {34,67,34,23,12,6,89};
		
		
		
		
		
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
		
		//Arrays.sort(a);
		Comparator obj=new ArrayAscendingClass();
		
		//String[] s= {"mani","kamal","rajini","ak","vijay","sk"};
		
		Arrays.sort(a, obj);
		
		
		 for(int i=0; i<a.length; i++) {
				
				System.out.println("        "+ a[i]);
			}
			
		
        
		
		

	}

	@Override
	public int compare(Object s, Object s1) {
		
		
		Integer s2=(Integer) s;
		Integer s3=(Integer) s1;
		
		
		if(s2>s3) {
			
			return 1;
		}
		else if(s2<s3) {
			return -1;
			
		
		}
		else {
			return 0;
		}
		
		
		
	
	}

}
