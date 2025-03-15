package view;

import javax.swing.JOptionPane;

import Controller.FatController;

public class Principal {

	public static void main(String[] args) {

		FatController fat = new FatController();

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 10"));
		
		if (num < 0 || num > 10) {
			System.out.println("Valor invalido");
		
		}
		else {	
		
	
		long res = fat.fatorial(num);
		System.out.println("Resultado fatorial: " + res);
	}
	}
}