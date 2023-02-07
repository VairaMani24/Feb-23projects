package seleniumReCall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaFiftyPrograms implements Comparator{

	public static void main(String[] args) {
		////// TODO Auto-generated method stub
		
		
		int [] a= {2,3,5,6,5,3,1,2,8};
		
		Integer[] b=new Integer[a.length];
		
		for (int i=0; i< a.length; i++) {
			
			 b[i]=a[i];
		}
		
		for (Integer integer : b) {
		System.out.println(integer);	
		}
		
		JavaFiftyPrograms obj=new JavaFiftyPrograms();
		
		Set<Integer> se=new LinkedHashSet<>();
		
		Arrays.sort(b,obj);
		
		
		
		for (Integer integer : b) {
			//System.out.print("  "+integer);
			
			se.add(integer);
			}
		
		
	System.out.println(se);
		
	
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		Integer a=(Integer) arg0;
		Integer b=(Integer) arg1;
		
		if(a>b) {
			return -1;
			
		}
		else if(b>a){
			return +1;
		}
		else {
		
		return -1;
		}
	
	}
}
