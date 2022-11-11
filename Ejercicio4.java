/**
*
*	Ejercicio 4, Programa que suma, resta, mult y divide dos numeros ingresados por pantalla.
* 
*	Nombre del archivo: Ejercicio4.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio4 {
	public static void main(String[] args) {
		
		System.out.print("Introduce el primer numero: ");
		int primerNumero = Integer.parseInt( System.console().readLine() );
		
		System.out.print("Introduce el segundo numero: ");
		int segundoNumero = Integer.parseInt( System.console().readLine() );
		
		int suma = primerNumero + segundoNumero;
		int resta = primerNumero - segundoNumero;
		int mult = primerNumero * segundoNumero;
		double div = (double)primerNumero / (double)segundoNumero;
		
		System.out.println("La suma: " + suma);
		System.out.println("La resta: " + resta);
		System.out.println("La mult: " + mult);
		System.out.println("La div: " + div);
		
	}
}
