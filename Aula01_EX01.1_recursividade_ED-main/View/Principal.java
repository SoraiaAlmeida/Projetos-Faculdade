/* OBJETIVO: 1 Crie uma fun��o recursiva que exiba o resultado do fatorial de um n�mero
 *(Pela limita��o da recursividade, o n�mero de entrada dever� ser baixo para n�o dar estouro(limite de entrada = 12)): 
 * O c�digo deve trazer como coment�rios:
 * a) A condi��o de parada b) Como escrever a fun��o para o termo n em fun��o do termo anterior
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


