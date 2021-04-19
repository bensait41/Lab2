package lab2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		int cookies;
		int calories;
		
		System.out.println("Enter number of cookies eaten:");
		cookies = scan.nextInt();
		
		scan.close();
		
		calories=75*cookies; //1 cookies has 75 calorie and 1/4 serving.
		
		System.out.println("Calorie amount in " + cookies + " cookies is: " + calories);
		
		
		
		
		
		
	}

}
