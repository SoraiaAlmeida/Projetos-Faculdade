package Controller;

import java.util.Random;

import br.edu.fateczl.filastring.Fila;

public class ImpressoraController {
	
	public void insereDocumento(Fila f, String documento) {
		f.insert(documento);
		System.out.println(" O documento foi adicionado na fila de impressão: " + documento);
	}
	
	public void imprime(Fila f) throws Exception {
		if (f.isEmpty()) {
			throw new Exception("A fila de de impressão está vazia!");
		}
		
		String documento = f.remove();
		String[] infoDocumento = documento.split(";");
		String idPC = infoDocumento[0];
		String nomeArquivo = infoDocumento[1];
		
		System.out.println("[#PC: " + idPC + " - Arquivo: " + nomeArquivo + "]");
		
		Random rand = new Random();
		int tempo = rand.nextInt(1000) + 1000; 
		Thread.sleep(tempo);
	}
	
}
