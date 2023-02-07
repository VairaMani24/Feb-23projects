package javaPrograms;

public class PrintWordsCharNumber {

	public static void main(String[] args) {
		// Print number of character
		String s2="java program selenium frameWork";
		String s1= "vairamani24@gmail.com";
		
		String s3="";
		
		String s8="";
		
		char[] charArray = s1.toCharArray();
		
		int length = charArray.length;
		
		System.out.println(length);
		
		String[] split = s2.split(" ");
		int length2 = split.length;
		
		System.out.println("count of Words"+length2);
		
		for(String s:split) {
			
			
			int length3 = s.length();
			String reverse="";
			
			for(int i=length3-1; i>=0; i--) {
				
				reverse=reverse+s.charAt(i);
				
			}
			
			s3=s3+reverse+" ";
			
			
			
			
		}
		
		
		
		System.out.println(s3);
		
		
		for(String e: split) {
		 String s6="";
		 String s7="";
		 
		 for(int i=0; i<e.length();i++) {
			 
			 if(i==0) {
			s6=s6+ Character.toUpperCase(e.charAt(i));
			 }
			 else {
			 s7=s7+e.charAt(i);
			 }
			 
			 
		 }
			
		s8=s8+s6+s7+" ";
		

	}
		
		
		System.out.println("all first letter should caps"+s8);
	}
}
