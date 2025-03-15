package Controller;

import br.fateczl.pilhasString.PilhaString;

public class PalindromoController {

	public PalindromoController() {
		super();
	}

	public String invertePalavra(PilhaString p, int tamanho) throws Exception{
		String letra, palavra = "";
		for (int i = 0; i < tamanho; i++) {
			letra = p.pop();
			palavra = palavra + letra;
		}
		return palavra;
	}
	
	public boolean comparaPalavra (String palavra, String palavraInvertida) {
		int res = palavra.compareToIgnoreCase(palavraInvertida);
		if (res == 0) {
			return true;
		}else {
			return false;
		}
	}
}