package Numbers;

import java.util.Scanner;

/*WAP to check whether a number is neon number */
public class prg21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int actnum = s.nextInt();
		int num = actnum;
		num = actnum;
		int rem;
		int sum = 0;
		int pow = num*num;
		while (pow > 0) {
			rem = pow % 10;
			num /= 10;
			sum +=rem;
			pow/=10;             
		}
		System.out.println(sum);

		if (sum == actnum) {
			System.out.println("number is neon");
		} else {
			System.out.println("Not neon");
		}
		s.close();
}
}
