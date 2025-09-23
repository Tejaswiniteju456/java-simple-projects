package Numbers;

import java.util.Scanner;

public class prg32 {
	/*WAP to check cuberoot using method*/
	
	
	
	
	public static double cbroot(int num) {
		double cbrt=num/2;
		double temp=0;
		while (cbrt-temp!=0)
		{
			temp=cbrt;
			cbrt=(2*temp+(num/(temp*temp)))*1/3;
			
		}
		return cbrt;
		
	}
	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = s.nextInt();
			
          double cbrt1=cbroot( num);
	         System.out.println(cbrt1);
			
			
			s.close();
			}

}
