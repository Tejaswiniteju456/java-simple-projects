package Numbers;
/* Write program to swap two numbers using temp variable*/
public class prg1 {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		int temp=0;
		
		System.out.println("Before swapping :");
		System.out.println(a);
		System.out.println(b);
		 
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping :");
		System.out.println(a);
		System.out.println(b);
		
	}

}
