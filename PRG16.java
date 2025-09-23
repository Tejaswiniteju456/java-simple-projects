
	package Numbers;

	/*WAP to print  factorial using recurision */
	import java.util.Scanner;

	public class PRG16{
		int fact = 1;
		public static int fact(int num) {
			if(num==0) {
				return 1;
				}
			else {
				return num*fact(num-1);
			}
					
			
		}
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter num");
			int num = s.nextInt();				
			System.out.println(fact(num));
			s.close();
		}

	}


