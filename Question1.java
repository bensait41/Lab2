package lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your first number:");
        
        int firstNumber = sc.nextInt();

        int greatest=firstNumber;  //2
        
        int smallest=firstNumber;  //2

        int yesNo = 1;
        int newNumber;
        
        while (yesNo == 1) {

            
            System.out.print("Enter your next number:");
            newNumber = sc.nextInt();  //3
            
            
            
            if (newNumber < smallest) {  // 3<2
                smallest=newNumber; 
            }
                
            
            if (newNumber > greatest) {  //3>2
                greatest=newNumber;  
            }
            
            
            System.out.print("Do you want to enter another number: 0-NO, 1-Yes");
            yesNo = sc.nextInt();

        }
        sc.close();
        System.out.print("Smallest number is: "+smallest + "\n");
        System.out.print("Greatest number is: "+greatest);
		
	}

}
