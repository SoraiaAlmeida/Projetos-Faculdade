/* OBJETIVO: 1 Crie uma função recursiva que exiba o resultado do fatorial de um número
 *(Pela limitação da recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)): 
 * O código deve trazer como comentários:
 * a) A condição de parada b) Como escrever a função para o termo n em função do termo anterior
 */


package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller Fat = new Controller();
			
			int valor = 8;
			int resultado = Fat.Fatorial(valor);
			System.out.println(resultado);
		}


	}


