import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para convertirlo a binario");
		int n= teclado.nextInt();
		teclado.close();
		
		System.out.println(conversorBinario(n));
		//String res = Integer.toBinaryString(n);
		//System.out.println(res);

	}
	
	public static String conversorBinario(int n) {
		StringBuilder binario = new StringBuilder();
		
		while (n>0) {
			int res = n%2;
			binario.insert(0,Integer.toString(res));
			n/=2;
		}
		
		
		
		return binario.toString();
	}

}
