package Numbers;

import java.util.Scanner;

public class prg34 {

	public static int digit(int num) {
		int digit = 0;
		while (num > 0) {

			digit++;
			num /= 10;
		}
		return digit;
	}

	public static boolean fascinum(int num) {
		String fnum = "" + num + num * 2 + num * 3;
		boolean flag = true;
		 System.out.println(fnum);
		for (char ch = 1; ch <9; ch++) {
			int count = 0;
			for (int i = 0; i < fnum.length(); i++) {
				if (fnum.charAt(i) == ch) {
					count++;
				}
			}
			if (count != 1) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if((digit(num))>=3) {  
          if(fascinum(num)) {
        	 System.out.println("facsinating no");
        	
           }
          else {
        	 System.out.println("not facsinating no");
         }
      
      }
      else{
    	   System.out.println("not facsinating no");
    	   }
      s.close();
	}
}

