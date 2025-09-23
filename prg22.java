package Numbers;

import java.util.Scanner;

public class prg22 {
	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int actnum = s.nextInt();
			int num = actnum;
			num = actnum;
			int rem;
			int sum = 0;
			
			while (num > 0) {
				int fact = 1;
				   
				rem = num % 10;
				
				for (int i = rem; i >= 1; i--) {
					fact*= i;
				}
				
				num /= 10;
				sum +=fact;
				          
			}
			System.out.println(sum);

			if (sum == actnum) {
				System.out.println("number is peterson");
			} else {
				System.out.println("Not peterson");
			}
			s.close();
		
	}

}
