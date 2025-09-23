
package Numbers;

/*WAP to print  factorial using recursion */
import java.util.Scanner;

public class prg18 {
	static int  n1=0,n2=1,n3;
public static void fib(int count) {
		
			if(count>0) {
				n3=n1+n2;
				System.out.print(","+n3);
				n1=n2;
				n2=n3;
				fib(count-1);
				}
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter count");
		int count = s.nextInt();
		System.out.print(n1 + "," + n2);
		fib(count - 2);
		s.close();
	}

}
