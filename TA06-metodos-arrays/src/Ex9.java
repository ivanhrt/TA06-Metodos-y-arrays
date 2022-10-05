import java.util.Scanner;
import java.util.Random;

public class Ex9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica el tamaño del array");
		int array[] = new int[teclado.nextInt()];
		teclado.close();
		rellenarArray(array, 0, 9);
		mostrarArray(array);

	}
	
	public static void rellenarArray(int[] array, int min, int max) {
		Random rand = new Random();
		for(int i=0;i<array.length;i++) {
			array[i] = rand.nextInt(max-min) + min;
		}
		
	}
	
public static void mostrarArray(int[] array) {
		int suma=0;
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
			suma+=array[i];
		}
		System.out.println("\nLa suma es "+suma);
		
	}

}
