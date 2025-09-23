package Numbers;
/* Write program to swap two numbers without using temp variable*/
public class prg2 {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		
		
		System.out.println("Before swapping :");
		System.out.println(a);
		System.out.println(b);
		 
		
		a=a+b;
		a=a-b;
		b=a-b;
		System.out.println("after swapping :");
		System.out.println(a);
		System.out.println(b);
		
	}

}
