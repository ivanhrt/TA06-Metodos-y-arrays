import java.util.Random;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la longitud de los arrays");
		int longitud = teclado.nextInt();
		teclado.close();
		int v1[] = new int[longitud];
		rellenarArray(v1,0,9);
		int v2[] = copiarArray(v1);
		rellenarArray(v2,0,9);
		int v3[] = multiplicarArrays(v1,v2);
		
		mostrarArray(v1);
		mostrarArray(v2);
		mostrarArray(v3);

	}
	
	public static int[] copiarArray(int[] array1) {
		int array2[] = new int[array1.length];
		
		for(int i=0;i<array2.length;i++) {
			array2[i] = array1[i] * array2[i];
		}
		
		return array2;
	}
	
	public static void rellenarArray(int[] array, int min, int max) {
		Random rand = new Random();
		for(int i=0;i<array.length;i++) {
			array[i] = rand.nextInt(max-min) + min;
		}
	}
	
	public static int[] multiplicarArrays(int[] array1, int[] array2) {
		int arrayFinal[] = new int[array1.length];
		
		for(int i=0;i<arrayFinal.length;i++) {
			arrayFinal[i] = array1[i] * array2[i];
		}
		
		return arrayFinal;
	}
	
	public static void mostrarArray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.print(String.format("%4d", array[i]));
		}
		System.out.println();
		
	}

}
