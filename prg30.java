package Numbers;

import java.util.Scanner;

public class prg30 {
	/*WAP to check whether num is sunny no using method*/
	
	
	
	
	public static double sqrtroot(int num) {
		double sqrt=num/2;
		double temp=0;
		while (sqrt-temp!=0)
		{
			temp=sqrt;
			sqrt=(temp+num/temp)*1/2;
			
		}
		return sqrt;
		
	}
	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = s.nextInt();
			
      double sqrt=sqrtroot( num+1);
			if(sqrt%1==0)
			{
				System.out.println("it is sunny num");
				
			}else
			{
				System.out.println("it is not sunny num");	
				
			}
			
			
			s.close();
			}

}
