package lab2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
	

		// 100 + 6.75 + 20 = 126.75  //charge of meal + tax + tip = totalBill
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the charge for the meal:");
		int charge = scan.nextInt();
		
		scan.close();
		
		double tax = charge * 0.0675;
		
		double tip = (charge + tax) * 0.20;
		
		double totalBill= charge + tax + tip;
		
		
		
		System.out.println("Meal of charge: " + charge);
		System.out.println("Tax Amount: " + tax);
		System.out.println("Tip Amount:" + tip);
		System.out.println("Total Bill: " + totalBill);
		
		
	}

}
