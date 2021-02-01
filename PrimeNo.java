package Assignment1;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number : ");

		Scanner scan =new Scanner (System.in);
		int number= scan.nextInt();
		int factor=0;

		for(int i=2;i<=number-1;i++)
		{
			if((number % i) ==0) {

				factor=factor+1;

			}
		}
		if(factor==2) {
			System.out.println(number +" is a Prime Number.");
		}
		else {
			System.out.println(number + " is not a Prime Number.");
		}
	}
}
