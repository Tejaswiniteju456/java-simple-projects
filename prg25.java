package Numbers;

import java.util.Scanner;
/* WAP to check whether no is emirp no*/
public class prg25 {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int actnum = s.nextInt();
		int revnum = 0;
		int num = actnum;
		boolean flag = true;
		boolean flag1 = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
				}
			}

		while (num > 0) {			
			
			int rem = num % 10;
			revnum = revnum * 10 + rem;
			num = num / 10;
		}
		for (int i = 2; i <= revnum / 2; i++) {
			if (revnum % i == 0) {
				flag1 = false;
				break;
			}
		}
		
		
		System.out.println("reverse of given num :" + revnum);
		
		
		
		if(flag&&flag1) {
			System.out.println("number is  emirp");
			}
		else {
			System.out.println("  number is Not emirp");
		}
		s.close();
}
	
}

	
