package javaPrograms;

public class PrimeNumberCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
		
	for(int a=1; a<=1000; a++) {	
		
		boolean temp=false;
		for(int i=2; i<a; i++) {
			
			if(a%i==0) {
				
				
				
				temp=true;
				
				break;
			}
			
		
		}
		
		if(temp==false) {
			System.out.print(a+" ");
		}
	
	}
		

	}

}
