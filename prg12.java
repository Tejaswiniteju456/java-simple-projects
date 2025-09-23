package Numbers;
/*WAP to check number is prime or not*/
import java.util.Scanner;

public class prg12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println("It  is prime number");
		} else {
			System.out.println("It is not prime number");
		}
		s.close();
	}

}
