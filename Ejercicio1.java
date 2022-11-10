/**
*
*	Ejercicio 1, Pide dos numeros por teclado y muestra el resultado de su multiplicación.
* 
*	Nombre del archivo: Ejercicio1.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio1 {
	public static void main(String[] args) {
		
		System.out.print("Por favor, introduce un número: ");
		int primerNumero = Integer.parseInt( System.console().readLine() );
		
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = Integer.parseInt( System.console().readLine() );
		
		int mult = primerNumero * segundoNumero;
		
		System.out.println("El resultado de '" + primerNumero + "' multiplicado por '" + segundoNumero + "' es: " + mult);	
		
	}
}
