/* OBJETIVO: Crie uma fun��o recursiva que exiba o resultado da invers�o de uma cadeia de caracteres 
 * (Ex.: entrada = teste ; sa�da = etset): Deve se utilizar a fun��o SUBSTRING da Java O c�digo deve trazer como coment�rios:
 *  a) A condi��o de parada b) Como escrever a fun��o para o termo n em fun��o do termo anterior
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

