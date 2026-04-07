package discipline;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter operation ( + , - ,* , % , / ):");
		
		String op = sc.next();
		char operation = op.charAt(0);
		
		switch (operation) {
		case '+':
			System.out.println("result = " +(a+b));
			break;
		case '-':
			System.out.println("result = "+(a-b));
			break;
		case '*':
			System.out.println("result = "+ (a*b));
			break;
		case '%':
			System.out.println("result ="+ (a%b));
			break;
		case '/':
			System.out.println("result ="+ (a/b));
			
			
			
		}
	}

}
