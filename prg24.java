package Numbers;

import java.util.Scanner;

/* WAP to check whether no is spy no*/
public class prg24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int rem;
		int sum = 0;
		int prod = 1;
		while (num > 0) {

			rem = num % 10;
			sum += rem;
			prod *= rem;
			num /= 10;

		}
		System.out.println(sum);
		System.out.println(prod);
		if (sum == prod) {
			System.out.println("number is spy no");
		} else {
			System.out.println("Not spy no");
		}
		s.close();
	}
}
