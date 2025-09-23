package Numbers;

import java.util.Scanner;

public class prg37 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = s.nextInt();
		int evensum = 0;
		int oddsum=0;
		for(int i=1;i<=num;i++) {
		if(i%2==0)
		{
			evensum+=i;
		}
	else{
	 oddsum+=i;
	}
				
		}
		
		System.out.println(evensum);
		System.out.println(oddsum);
		s.close();
	}
	}

