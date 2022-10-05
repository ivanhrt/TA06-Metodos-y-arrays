import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad de euros a cambiar");
		double euros= teclado.nextDouble();
		System.out.println("Introduce la moneda a la cual convertir (libra, dolar o yen)");
		String moneda= teclado.next();
		teclado.close();
		
		conversionMoneda(moneda, euros);

	}

	private static void conversionMoneda(String moneda, double euros) {
		switch (moneda) {
		case "libra":
			System.out.println(euros+" euros equivalen a "+euros*0.86+" libras"); break;
		case "dolar":
			System.out.println(euros+" euros equivalen a "+euros*1.28611+" dolares"); break;
		case "yen":
			System.out.println(euros+" euros equivalen a "+euros*129.852+" yenes"); break;
		default:
			System.out.println("No has introducido una moneda válida");
		}
		
		
	}

}
