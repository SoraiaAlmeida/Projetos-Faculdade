/* Objetivo: Considere a série de Fibonacci:
• 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

 Escrever uma função recursiva que, dado uma posição da série, a função
retorne seu valor. Entrada limitada a 20.

- Como foi definida a condição de parada;
- Como foi definida a relação de chamada dos passos;
 */

package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller fib = new Controller();
		
		int num = 10;
		int numero = fib.numero(num);
		
	
		System.out.println(numero);	 	 
		
		

	}

}
