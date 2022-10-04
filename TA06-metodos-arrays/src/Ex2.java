import java.util.Random;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad de números");
		int cantidad= teclado.nextInt();
		System.out.println("Introduce el maximo");
		int max= teclado.nextInt();
		System.out.println("Introduce el minimo");
		int min= teclado.nextInt();
		teclado.close();
		
		for (int i=0;i<cantidad;i++) {
			System.out.println(GeneraAleatorio(max,min));
		}

	}
	
	public static int GeneraAleatorio(int max, int min) {
		Random random = new Random();
		return random.nextInt(max-min+1)+min;
	}

}
