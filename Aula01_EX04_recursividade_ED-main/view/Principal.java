/* OBJETIVO: Crie uma função recursiva que exiba o resultado da inversão de uma cadeia de caracteres 
 * (Ex.: entrada = teste ; saída = etset): Deve se utilizar a função SUBSTRING da Java O código deve trazer como comentários:
 *  a) A condição de parada b) Como escrever a função para o termo n em função do termo anterior
 */


package view;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		String palavra = "Soraia";
		int tamanho = palavra.length(); 
		
		Controller inversa = new Controller();
		
		String resultado = inversa.inversor(palavra, tamanho);
		
		System.out.println(resultado);
	}



	}

