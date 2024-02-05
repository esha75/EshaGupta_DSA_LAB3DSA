package Assignment1;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Expression:");
		
		String input=sc.next();
		MyStack ms=new MyStack();
		
		if (input.length()%2==1) {
			System.out.println("Incomplete Expression");
		}
		else {
			if(ms.validate(input)) {
				System.out.println("Correct Experssion");
			}
			else {
				System.out.println("Incorrect Expression");
				
			}
		}
		sc.close();
	}

}
