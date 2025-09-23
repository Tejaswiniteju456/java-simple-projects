package Numbers;
import java.util.Scanner;
public class prg7{
public static void main(String[] args) {
Scanner s= new java.util.Scanner(System.in);

	System.out.println("Enter the number");
	int num=s.nextInt();
	
		if(num>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("negative");
		}
		s.close();
		
	}
			
}

