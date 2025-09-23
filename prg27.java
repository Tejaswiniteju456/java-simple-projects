package Numbers;

import java.util.Scanner;
/*WAP to check sqrt of num*/  
public class prg27 {
	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = s.nextInt();
			double sqrt=num/2;
			double temp=0;
			while (sqrt-temp!=0)
			{
				temp=sqrt;
				sqrt=(temp+num/temp)*1/2;
				
			}
			System.out.println(sqrt);
			
			s.close();
			}
}

