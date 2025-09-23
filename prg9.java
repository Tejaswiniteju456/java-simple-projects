package Numbers;

/* WAP to count product of given number */
import java.util.Scanner;

public class prg9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int prod = 1;

		while (num > 0) {
			int rem = num % 10;
			prod=prod*rem; //sum=sum+num%10;//sum+=num%10
			num = num / 10;

		}
		System.out.println("product of digit :" +prod);
		s.close();
	}
}
