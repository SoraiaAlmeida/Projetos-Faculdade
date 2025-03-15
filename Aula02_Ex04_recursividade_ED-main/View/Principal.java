/* Objetivo: Criar uma aplica��o em Java que tenha uma fun��o recursiva que, recebendo um numero inteiro de 10 a 999999 
 e recebendo um 2� n�mero inteiro (de 0 a 9), tenha uma fun��o recursiva que apresente
quantas vezes o 2� n�mero aparece no primeiro.

� Exemplo1: 1�. N�mero = 523578; 2�. N�mero = 5; retorno aparece 2 vezes
� Exemplo2: 1�. N�mero = 836363; 2�. N�mero = 3; retorno aparece 3 vezes

� A valida��o da entrada e do d�gito deve ser feito na main da aplica��o e n�o
na fun��o recursiva;
� Como foi definida a condi��o de parada;
� Como foi definida a rela��o de chamada dos passos;

*/



package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller cont = new Controller ();
		int a = 190693;
		int b = 9;
		
        int numero = cont.numero(a, b);
		
		System.out.println (numero);
		
	}

}
