package Numbers;

import java.util.Scanner;

public class prg35 {

	public static boolean checkyear(int year) {
		 boolean flag = true;
	 
		if (year % 4 == 0) {
		  if (year % 100 == 0) {
	        	 if (year % 400 == 0) {
	                    flag = true;
	                    }
	              else{
	        		 flag = false;
			          }
	             }
		}
		else
		{
			 flag = false;
		}
		return flag;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = s.nextInt();
		if(checkyear(year)) {
		System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is a not leap year");
		}
		
		s.close();
			}
}
