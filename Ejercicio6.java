/**
*
*	Ejercicio 6, Programa que calcula el área de un triangulo.
* 
*	Nombre del archivo: Ejercicio6.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio6 {
	public static void main(String[] args) {
		
		System.out.print("Introduce la altura del triangulo: ");
		int altura = Integer.parseInt( System.console().readLine() );
		
		System.out.print("Introduce la base del triangulo: ");
		int base = Integer.parseInt( System.console().readLine() );
		
		double areaTriangulo = ((double)altura * (double)base) / 2;
		
		System.out.println("El área del triangulo es de: " + areaTriangulo + " Cm2");
		
	}
}
