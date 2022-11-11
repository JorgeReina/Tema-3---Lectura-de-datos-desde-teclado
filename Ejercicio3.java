/**
*
*	Ejercicio 3, Conversor de pesetas a euros, las pesetas se introducen por teclado.
* 
*	Nombre del archivo: Ejercicio3.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio3 {
	public static void main(String[] args) {
		
		double euros = 0.016;
		
		System.out.println("********************************");
		System.out.println("* Conversor de Pesetas a Euros *");
		System.out.println("********************************");
		
		System.out.print("Introduzca la cantidad de Pesetas que desea cambiar: ");
		int pesetas = Integer.parseInt( System.console().readLine() );
		
		double conversor =  pesetas * euros;
		
		System.out.println("Las '" + pesetas + "' pesetas son '" + conversor + "' euros.");
		
	}
}

