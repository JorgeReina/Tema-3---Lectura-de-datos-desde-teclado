/**
*
*	Ejercicio 2, Conversor de euros a pesetas, los euros se introducen por teclado.
* 
*	Nombre del archivo: Ejercicio2.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int pesetas = 166;
		
		System.out.println("********************************");
		System.out.println("* Conversor de Euros a Pesetas *");
		System.out.println("********************************");
		
		System.out.print("Introduzca la cantidad de Euros que desea cambiar: ");
		int euros = Integer.parseInt( System.console().readLine() );
		
		int conversor = euros * pesetas;
		
		System.out.println("Los '" + euros + "' euros son '" + conversor + "' pesetas.");
		
	}
}
