package Numbers;

import java.util.Scanner;

/*WAP to check whether num is sunny no*/
public class prg29 {
			
			 public static void main(String[] args) {
					Scanner s = new Scanner(System.in);
					System.out.println("Enter the number");
					int num = s.nextInt();
					int num1=num+1;
					double sqrt=num1/2;
					double temp=0;
					while (sqrt-temp!=0)
					{
						temp=sqrt;
						sqrt=(temp+num1/temp)*1/2;
						
					}
					System.out.println(sqrt);
					
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






