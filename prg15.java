package Numbers;

/*WAP to print  factorial  number from 1 to 1000*/
import java.util.Scanner;

public class prg15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter num");
		int num = s.nextInt();
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
			
			
		}
		System.out.println(fact);
		s.close();
	}

}
