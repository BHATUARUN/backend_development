package discipline;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter radius");
		float radius = sc.nextFloat();
		
		float area = 3.14f * radius * radius;
	    
		System.out.println("radius is:"+ radius);
		System.out.println("area is:"+ area);
		 
	}
}