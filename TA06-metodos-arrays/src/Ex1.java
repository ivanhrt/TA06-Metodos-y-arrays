import java.util.Scanner;

public class Ex1 {
	
	static final double PI = 3.14;

	public static void main(String[] args) {
		System.out.println("Introduce si quieres calcular el área de un círculo, un triángulo o un cuadrado");
		Scanner teclado = new Scanner(System.in);
		String figura = teclado.next();
		
		switch (figura) {
		case "circulo": 	System.out.println("Introduce el radio");
							double r = teclado.nextDouble();
							System.out.println("El área es "+circulo(r));
							break;
		case "triangulo": 	System.out.println("Introduce la base");
							double b = teclado.nextDouble();
							System.out.println("Introduce la altura");
							double a = teclado.nextDouble();
							System.out.println("El área es "+triangulo(b,a));
							break;
		case "cuadrado": 	System.out.println("Introduce el lado");
							double l = teclado.nextDouble();
							
							System.out.println("El área es "+cuadrado(l));
							break;
		
		}
		teclado.close();
		
	}
	
	public static double circulo(double radio) {
		return(radio*radio*PI);
	}
	
	public static double triangulo(double base, double altura) {
		return(base*altura/2);
	}
	
	public static double cuadrado(double lado) {
		return(lado*lado);
	}

}
