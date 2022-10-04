import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para saber si es primo");
		int n= teclado.nextInt();
		teclado.close();
		if (esPrimo(n))
			System.out.println("El número introducido es primo");
		else
			System.out.println("El número introducido NO es primo");
		

	}
	
	public static boolean esPrimo(int n) {
		if (n<2)
			return false;
		else {
			for (int i=2;i<n/2+1;i++) {
				if (n%i==0)
					return false;
			}
		}
		return true;
	}

}
