
package src;

import java.util.Scanner;

public class addNumber {

	public static void main(String[] args) {

	
	Scanner cr =new Scanner(System.in);
	
	System.out.println("enter first number 1");
	int n1=cr.nextInt();
	
	System.out.println("enter second number 2");
	int n2=cr.nextInt();
	
	System.out.println("enter third number 3");
	int n3=cr.nextInt();
	
	int d=n1*n2*n3;
	
	System.out.println("Total"+ d);
	
	cr.close();
	
     
	}

}
