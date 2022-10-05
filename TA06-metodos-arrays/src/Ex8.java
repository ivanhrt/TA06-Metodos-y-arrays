import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		int array[] = new int[10];
		rellenarArray(array);
		mostrarArray(array);

	}
	
	public static void rellenarArray(int[] array) {
		Scanner teclado = new Scanner(System.in);
		for (int i=0;i<array.length;i++) {
			System.out.println("Introduce un número entero");
			array[i]=teclado.nextInt();
		}
		teclado.close();
		
	}
	
	public static void mostrarArray(int[] array) {
		
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
