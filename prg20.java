package Numbers;

import java.util.Scanner;

/*WAP to check whether a number Amstrong number */
public class prg20 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int actnum = s.nextInt();
		int num = actnum;
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		num = actnum;
		int rem;
		int sum = 0;

		while (num > 0) {
			int pow = 1;
			rem = num % 10;
			for (int i = 0; i < count; i++) {
				pow *= rem;
			}
			num /= 10;
			sum += pow;
		}

		if (sum == actnum) {
			System.out.println("number is amstrong");
		} else {
			System.out.println("Not amstorng");
		}
		s.close();
	}
}
