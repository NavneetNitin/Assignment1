package Assignment1;

public class FirstFiveNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=1000;i++) {
			if(i%2==0 && i%3==0 && i%5==0) {
				System.out.println(i);
				count=count+1;
				if (count==5){
					break;
				}
			}
		}
	}

}
