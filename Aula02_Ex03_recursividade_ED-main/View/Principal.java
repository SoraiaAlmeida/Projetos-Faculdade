/* OBJETIVO: 3. Criar uma aplicação em Java que tenha uma função recursiva que,
recebendo um número inteiro (N), apresente a saída da somatória

        𝑆 = 1 + 1 + 1 + 1 + .... + 1
                2   3   4          N
                
a) Como foi definida a condição de parada;      
b) Como foi definida a relação de chamada dos passos;          
  
 */
package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller cont = new Controller();
		
		int N = 8;
		double somatoria = cont.somatoria(N);
		
		System.out.println(somatoria);
		

	}

}
