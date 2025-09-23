package Numbers;

/*WAP to print  prime number from 1 to 1000*/

public class prg14 {

	public static void printprime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println(num);
		}

	}

	public static void main(String[] args) {

		for (int i = 1; i < 1000; i++) {
			printprime(i);
		}
	}

}
