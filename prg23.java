package Numbers;

import java.util.Scanner;

/*WAP to check whether number is prefect number*/
public class prg23 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int actnum = s.nextInt();
		int num = actnum;
		num = actnum;
		
		int sum = 0;
		
		
			for(int i=1;i<=num/2;i++) {
				if(num%i==0) {
					sum +=i;
				}
			
			}
			   
		
		System.out.println(sum);

		if (sum == actnum) {
			System.out.println("number is prefect num");
		} else {
			System.out.println("Not prefect num");
		}
		s.close();
	}

}
