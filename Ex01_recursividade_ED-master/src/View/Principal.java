/* OBJETIVO:  Crie uma função recursiva que receba 2 valores A e B, por somas, apresente o resultado
 da multiplicação de A por B.
 */



package View;

import controller.controller;

public class Principal {

	public static void main(String[] args) {
		controller cont = new controller();
		
		int A = 5;
		int B = 3;
		int soma = cont.soma(A, B);
		System.out.println(soma);
		
		
	}

}
