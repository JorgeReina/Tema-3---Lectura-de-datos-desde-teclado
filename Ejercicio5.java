/**
*
*	Ejercicio 5, Programa que calcula el área de un rectángulo.
* 
*	Nombre del archivo: Ejercicio5.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio5 {
	public static void main(String[] args) {
		
		System.out.print("Introduce la altura del rectángulo: ");
		int altura = Integer.parseInt( System.console().readLine() );
		
		System.out.print("Introduce la base del rectángulo: ");
		int base = Integer.parseInt( System.console().readLine() );
		
		int areaRectangulo = altura * base;
		
		System.out.println("El área del rectángulo es de: " + areaRectangulo + " Cm2");
		
	}
}
