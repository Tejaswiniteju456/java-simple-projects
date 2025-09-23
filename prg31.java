package Numbers;

import java.util.Scanner;
/*WAP to check  cuberoot of num*/  
public class prg31 {
	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = s.nextInt();
			double cbrt=num/2;
			double temp=0;
			while (cbrt-temp!=0)
			{
				temp=cbrt;
				 cbrt=(2*temp+(num/(temp*temp)))*1/3;
				
			}
			System.out.println(cbrt);
			
			s.close();
			}

}
