package javaPrograms;

import java.util.Scanner;

public class CalculaterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b=sc.nextInt();
		System.out.println("select ur choice:  + or - or * or /");
		String s=sc.next();
		if(s.equals("+")) {
			System.out.println("Answer is : "+(a+b));
		}
		else if(s.equals("-")) {
			System.out.println("Answer is : "+(a+b));
		}
		else if(s.equals("*")) {
			System.out.println("Answer is : "+(a*b));
		}
		else {
			System.out.println("Answer is : "+(a/b));
		}

	}

}
