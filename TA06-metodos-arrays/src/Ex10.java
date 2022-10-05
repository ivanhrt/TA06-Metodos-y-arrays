import java.util.Random;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica el tamaño del array");
		int array[] = new int[teclado.nextInt()];
		System.out.println("Indica el valor mínimo");
		int min = teclado.nextInt();
		System.out.println("Indica el valor máximo");
		int max = teclado.nextInt();
		teclado.close();
		rellenarArray(array, min, max);
		mostrarArray(array);
		mostrarMaximoArray(array);

	}
	
	
	private static void mostrarMaximoArray(int[] array) {
		int max = array[0];
		for(int i=1;i<array.length;i++) {
			if (array[i]>max)
				max=array[i];
		}
		System.out.println("\nEl valor máximo dentro del array es "+max);
		
	}


	public static void rellenarArray(int[] array, int min, int max) {
		Random rand = new Random();
		for(int i=0;i<array.length;i++) {
			int numRandom;
			
			do {
				numRandom = rand.nextInt(max-min) + min; 
			}while (!esPrimo(numRandom));
			
			array[i] = numRandom;
		}
		
	}
	
	public static void mostrarArray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
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
