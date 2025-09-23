package Numbers;

import java.util.Scanner;

public class prg36 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = s.nextInt();
		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		s.close();
	}
}
