package javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=121676;
		int temp=a;
		
		int reverse=0;
		
		while(a>0) {
			
			
			int reminder=a%10;
			
			reverse=(reverse*10)+reminder;
			
			   a=a/10;
			
			
			}
		
		if(temp==reverse) {
			
			System.out.println("this number is polindrome"+ reverse);
		}
		else {
			
			System.out.println("this mumber is not polindrome"+reverse);
		}
		

	}

}
