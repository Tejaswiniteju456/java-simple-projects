
	package Numbers;

	
	import java.util.Scanner;

	public class prg17{
		
	public static void main(String[] args) {
        int n1=0;
		int n2=1;
		int n3;
			Scanner s = new Scanner(System.in);
			System.out.println("enter count");
			int count = s.nextInt();
			System.out.print(n1+","+n2);
			for(int i=0;i<count-2;i++) {
				n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
			}
			s.close();
		}

	}


