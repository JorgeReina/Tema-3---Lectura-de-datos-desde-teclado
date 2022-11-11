/**
*
*	Ejercicio 7, Programa que calcula el total de una factura a partir de la base imponible.
* 
*	Nombre del archivo: Ejercicio7.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio7 {
	public static void main(String[] args) {
		
		System.out.print("Introduce la base imponible: ");
		int base = Integer.parseInt( System.console().readLine() );
		
		double iva = (double)base * 1.21;
		
		System.out.println("El total de la factura con I.V.A. es de: " + iva + " Euros"); 
		
	}
}
