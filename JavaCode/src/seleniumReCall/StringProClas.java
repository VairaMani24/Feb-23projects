package seleniumReCall;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.beust.jcommander.converters.CommaParameterSplitter;

public class StringProClas{
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String s="java selenium testng cucumber apitesting ";
		
		
		String[] split = s.split(" ");
		
		int length = split.length;
		
		System.out.println(length+" "+"total words");
		
		String s2="";
		
		for(int i=0; i<length; i++) {
			
			Set<Character> ch=new LinkedHashSet<>();
			
			int length2 = split[i].length();
			
			System.out.println(length2);
			
			
			String s3 = split[i];
			
			for(int j=length2-1; j>=0; j-- ) {
				
				ch.add(s3.charAt(j));
				
				}
			
			Iterator<Character> iterator = ch.iterator();
			while(iterator.hasNext()) {
			s2=s2+iterator.next();	
			}
			
			s2=s2+" ";
			
			
			
			
			
		}
		
		System.out.println(s2);
		
		

}

	
}
