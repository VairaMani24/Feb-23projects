package javaPrograms;

public class StringReverseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="malayalam";
		
		String s1="";
		
		int count=0;
		
		
		
		
		for(int i=s.length()-1; i>=0; i--) {
			
			count++;
			
			s1=s1+s.charAt(i);
		}
		
		
		System.out.println(s1+" "+count);
		
		if(s.equals(s1)) {
			System.out.println("this String is palindrome");
		}
		

	}

}
