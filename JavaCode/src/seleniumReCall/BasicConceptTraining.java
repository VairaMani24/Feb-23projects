package seleniumReCall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicConceptTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	for (int i = 0; i < 10; i++) {
		
		for (int j =0; j < 10 ; j++) {
			
			if(i==0 && j==5) {
		    System.out.print("*");
			}
			else if(i==1 && (j==4 || j==5 ||j==6) )
				System.out.print("*");
			else if(i==2 && (j==3||j==4 || j==5 ||j==6 || j==7)) 
				System.out.print("*");
			else if(i==3 && (j==2 ||j==3||j==4 || j==5 ||j==6 || j==7 ||j==8))
				System.out.print("*");
			else if(i==4 && (j==1||j==2 ||j==3||j==4 || j==5 ||j==6 || j==7 ||j==8 ||j==9))
				System.out.print("*");
			else if(i==5 && (j==2 ||j==3||j==4 || j==5 ||j==6 || j==7 ||j==8))
				System.out.print("*");
			else if(i==6 && (j==3||j==4 || j==5 ||j==6 || j==7))
				System.out.print("*");
			else if(i==7 && (j==4 || j==5 ||j==6))
				System.out.print("*");
			else if(i==8 && ( j==5))
				System.out.print("*");
		//	else if(i==9 && (j==1||j==2 ||j==3||j==4 || j==5 ||j==6 || j==7 ||j==8 ||j==9))
				//
			//System.out.print("*");
			else {
				
				System.out.print(" ");
				
			}
				
				
			
			
		
		
	}
		
		System.out.println();

	}

}
}
