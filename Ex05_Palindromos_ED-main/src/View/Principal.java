package View;

import javax.swing.JOptionPane;

import br.fateczl.pilhasString.PilhaString;
import Controller.PalindromoController;

public class Principal {

	public static void main(String[] args) throws Exception {
		String palavra = JOptionPane.showInputDialog("Digite uma palavra");

		PilhaString p = new PilhaString();
		int tamanho = palavra.length();
		for (int i = 0; i < tamanho; i++) {
			p.push(palavra.substring(i, i + 1));
		}

		PalindromoController palin = new PalindromoController();
		String palavraInvertida = palin.invertePalavra(p, tamanho);
		boolean res = palin.comparaPalavra(palavra, palavraInvertida);
		if (res) {
			System.out.println("A palavra " + palavra + " é um palindromo");
		} else {
			System.out.println("A palavra " + palavra + " não é um palindromo");
		}
	}

}