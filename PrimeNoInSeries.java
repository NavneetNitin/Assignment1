package Assignment1;
import java.util.Scanner;
public class PrimeNoInSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner (System.in);
		
		System.out.println("Program of printing all prime number untill a number in series. ");
		System.out.println("");
		//Take lower Bound 0
		
		int lowerBound= 0;

		//Take upper bound
		System.out.println(" Enter the value : ");
		int upperBound= scan.nextInt();
		
		System.out.print( "Prime number untill "+upperBound+" is :" );
		
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
				
				System.out.print( +i+ ",");
				//end of 1st-if under loop2
			}				
		//End of loop1
		
	//End of main function
	}

}
}
