package Assignment1;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println (" Please Enter a Number");
		int num = scan.nextInt();
		
		int reversed=0;
		int temp=num;
		
		while (num !=0) {
			int lastDigit= num % 10;
			
			reversed=reversed*10+lastDigit;
			
			num=num/10;
		}
		if(temp==reversed)
		System.out.println("Given number is Pallindrome " + reversed );
		else
			System.out.println("given number is not a Pallindrome");
		

	}

}
