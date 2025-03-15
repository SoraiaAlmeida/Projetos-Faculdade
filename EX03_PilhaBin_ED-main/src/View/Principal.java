package View;


import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		int decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 a 1000"));;

		if (decimal < 0 || decimal > 1000) {
			System.out.println("Valor invalido");
		
		}
		else {	
		
		ConverteController converte = new ConverteController();
		converte.decToBin(decimal);
	}

}
}