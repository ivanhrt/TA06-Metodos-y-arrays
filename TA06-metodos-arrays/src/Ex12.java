import java.util.Random;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array");
		int arrayAleatorio[] = new int[teclado.nextInt()];
		
		rellenarArray(arrayAleatorio,1,300);
		int digito;
		do {
			System.out.println("Dígito");
			digito = teclado.nextInt();
		}while (digito<0||digito>9);
		
		int resultado[] = arrayDigitoFinal(arrayAleatorio,digito);
		teclado.close();
		
		mostrarArray(resultado);
		
		
		

	}
	
	public static void rellenarArray(int[] array, int min, int max) {
		Random rand = new Random();
		for(int i=0;i<array.length;i++) {
			array[i] = rand.nextInt(max-min) + min;
		}
	}
	public static int[] arrayDigitoFinal(int[] array, int digitoFinal) {
		
		int j=0;
		
		for (int i=0;i<array.length;i++) {
			if (array[i]%10==digitoFinal) {
				j++;
			}
		}
			
		int arrayFinal[] = new int[j];
		j=0;
		for (int i=0;i<array.length;i++) {
			if (array[i]%10==digitoFinal) {
				arrayFinal[j]=array[i];
				j++;
			}
				
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
