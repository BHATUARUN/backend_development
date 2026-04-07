package discipline;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
		int n = sc.nextInt();
		for(int i =1;i<=10;i++) {
		int result = n * i;
		   System.out.println(n + "*" + i + "=" + result);
	    }
	}
}

