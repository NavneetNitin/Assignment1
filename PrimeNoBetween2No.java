package Assignment1;

import java.util.Scanner;

public class PrimeNoBetween2No {

	public static void main(String[] args) {
		//Start of main function
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Please Enter Upper And Lower Bound to check all Prime Number between Them. ");
		System.out.println("");
		//Take lower Bound
		System.out.println(" Enter First Number : ");
		int lowerBound= scan.nextInt();

		//Take upper bound
		System.out.println(" Enter Last Number : ");
		int upperBound= scan.nextInt();
		
		for(int i=lowerBound;i<=upperBound; i++) {
			//Start of Loop1
			int factor=0;
			for (int j=1;j<=i;j++) {
				//Start of loop2
			
				if (i % j == 0) {
					//start of 1st-if under loop2
					factor=factor+1;
					//end of 1st-if under loop2
				}
				
			//End of loop2	
			}
			
			if(factor == 2) {
				//start of 1st-if under loop1
				System.out.println(i);
				//end of 1st-if under loop2
			}				
		//End of loop1
		}	
	//End of main function
	}

}
