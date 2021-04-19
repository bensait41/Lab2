package lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in);
        
        System.out.print("Enter positive nonzero integer value: ");
        
        int number=cs.nextInt();
        
        while(number<=0) {
            System.out.println("Wrong number!\nPlease enter a valid nonzero positive number: ");
            number=cs.nextInt();
        }
        
        cs.close();
        
        int sum=0;
        
        for(int i=1; i<=number; i++) {
            sum += i;
        }
        
        System.out.println("Sum of all the integers from 1 to " + number + " is: " + sum);

	}

}
