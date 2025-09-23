package Numbers;
/* WAP to check whether no is emrip no using method*/
import java.util.Scanner;

public class prg26 {
	 public static boolean isprime(int actnum) {
	int num = actnum;
	boolean flag = true;
	
	for (int i = 2; i <= num / 2; i++) {
		if (num % i == 0) {
			flag = false;
			break;
			}
		}
	   return flag;
	 }
	 
	 
	 public static int  reverse(int actnum) {
		 int num=actnum;
		 int revnum = 0;
			while (num > 0) {			
				
				int rem = num % 10;
				revnum = revnum * 10 + rem;
				num = num / 10;
			}
		return revnum;
	 }

   public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int actnum = s.nextInt();
			
			
			if(isprime(actnum)) {
				int revnum=reverse(actnum);
				
						if(isprime(revnum)) {
							System.out.println("number is  emirp");
							}
						else {
							System.out.println("  number is Not emirp");
						}
				
				
			}
			else
			{
				System.out.println("not emirp");
			}
		
			
			
			
			
		
			s.close();
	
		
	}

		


}
