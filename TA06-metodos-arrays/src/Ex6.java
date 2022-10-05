import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para calcular el número de cifras que contiene");
		String n= teclado.next();
		teclado.close();
		System.out.println(contarCifras(n));
		

	}
	
	public static int contarCifras(String n) {
		return n.length();
	}

}
