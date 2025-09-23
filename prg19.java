/*WAP to check whether number is automorphic number*/
package Numbers;

import java.util.Scanner;

public class prg19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int actnum = s.nextInt();
		int num = actnum;
		int automorpnum = num * num;

		boolean flag = true;
		System.out.println("square of given num :" + automorpnum);
		while (num > 0) {
			if (num % 10 != automorpnum % 10) {
				flag = false;
				break;
			}
			num = num / 10;
			automorpnum = automorpnum / 10;
		}

		
		if (flag) {
			System.out.println("number is automorphic");
		} else {
			System.out.println("Not automorphic");
		}
		s.close();
	}
}
