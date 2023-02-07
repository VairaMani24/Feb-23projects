package javaPrograms;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a= 123456;
		
		int count=0;
		
		int sum=0;
		
		while(a>0) {
			
			int reminder=a%10;
			count++;
			sum=sum+reminder;
			
			a=a/10;
			
			
		}
		
		
		System.out.println("sum oF Digits"+sum);
		System.out.println("count of Digits"+count);

	}

}
