package lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the amount of purchase:");
		double purchaseAmount=scan.nextDouble();
		
		scan.close();
		
		double countySaleTax = purchaseAmount * 0.02;
		double stateTaxSales = purchaseAmount * 0.04;
		double totalSalesTax = countySaleTax + stateTaxSales;
		
		
		
		System.out.println("Amount of purchase: " + purchaseAmount);
		System.out.println("State Tax Sale: " + stateTaxSales);
		System.out.println("County Tax Sale: " + countySaleTax);
		System.out.println("Total Sales Tax: " + totalSalesTax);
		System.out.println("Total of the Sale: " + (purchaseAmount + totalSalesTax));
	}

}
