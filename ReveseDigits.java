package Assignment1;

import java.util.Scanner;

public class ReveseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println (" Please Enter a Number");
		int num = scan.nextInt();
		int reversed=0;
		while (num !=0) {
			int lastDigit= num % 10;
			
			reversed=reversed*10+lastDigit;
			
			num=num/10;
		}
		
		System.out.println("Sum of all Digits = "+ reversed);
		

	}

}
