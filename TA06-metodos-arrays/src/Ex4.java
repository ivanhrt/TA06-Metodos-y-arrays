import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial");
		long n= teclado.nextLong();
		System.out.println(factorial(n));
		

	}
	
	public static long factorial(long n) {
		long res = 1;
		while (n>1) {
			res*=n;
			n--;
		}
		return res;
	}

}
