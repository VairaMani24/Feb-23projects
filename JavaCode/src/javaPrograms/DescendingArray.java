package javaPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class DescendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a=new int[6];
		
		a[0]=23;
		a[1]=43;
		a[2]=67;
		a[3]=8;
		a[4]=13;
		a[5]=8;
		
		
		for(int i=0; i<a.length; i++) {
			
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[j]>a[i]) {
					
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
				
			}
			
			
			
			
			
			
			}
		
		
		
		
	Set<Integer> se=new LinkedHashSet<Integer>();	
		
		
		for (int i = 0; i < a.length; i++) {
			
			se.add(a[i]);
			
		}
		
		
		for(Integer in : se) {
			
			System.out.println(in);
		}
		
		
		
		
			
		
		

	}

}
