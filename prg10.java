package Numbers;

/* WAP to reverse  given number */
import java.util.Scanner;

public class prg10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int actnum = s.nextInt();
		int revnum=0;
        int num=actnum;
		while (num > 0) {
			int rem = num % 10;
			
          revnum=revnum*10+rem;
			num = num / 10;

		}
		System.out.println("reverse of given num :"+revnum);
		s.close();
	}
}
