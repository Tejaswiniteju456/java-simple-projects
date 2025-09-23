package Numbers;

/* WAP to check whether given number is palindrome */
import java.util.Scanner;

public class prg11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int actnum = s.nextInt();
		int revnum = 0;
		int num = actnum;
		while (num > 0) {
			int rem = num % 10;
			revnum = revnum * 10 + rem;
			num = num / 10;
			}
		System.out.println("reverse of given num :" + revnum);
		if(actnum==revnum) {
			System.out.println("number is palindrome");
			}
		else {
			System.out.println("Not palindrome");
		}
		s.close();
	}
}
