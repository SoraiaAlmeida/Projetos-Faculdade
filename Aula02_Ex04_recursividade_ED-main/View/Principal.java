/* Objetivo: Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um numero inteiro de 10 a 999999 
 e recebendo um 2º número inteiro (de 0 a 9), tenha uma função recursiva que apresente
quantas vezes o 2º número aparece no primeiro.

• Exemplo1: 1º. Número = 523578; 2º. Número = 5; retorno aparece 2 vezes
• Exemplo2: 1º. Número = 836363; 2º. Número = 3; retorno aparece 3 vezes

• A validação da entrada e do dígito deve ser feito na main da aplicação e não
na função recursiva;
• Como foi definida a condição de parada;
• Como foi definida a relação de chamada dos passos;

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
