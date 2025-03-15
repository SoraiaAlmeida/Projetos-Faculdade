package Controller;

import br.com.leandrocolevati.pilhastrings.Pilha;

public class HistoricoController {

	public HistoricoController() {
		super();
	}

	public void inserir(String endereco, Pilha historico) {
		if (endereco.contains("http://www")) {
			historico.push(endereco);
			System.out.println("Endereço Inserido");
		} else {
			System.err.println("Endereco deve comecar com 'http://www'");
		}
	}

	public void remover(Pilha historico) throws Exception {
		if (historico.isEmpty()) {
			System.err.println("Historico está vazio");
		} else if (historico.size() < 2) {
			System.err.println("Historico nao pode ficar vazio");
		} else {
			historico.pop();
			System.out.println("Endereço removido");
		}
	}

	public void consultar(Pilha historico) throws Exception {
		
		if (historico.isEmpty()) {
			System.err.println("Historico está vazio");
		} else if (historico.size() < 2) {
			System.err.println("Historico nao pode ficar vazio");
		} else {
			String endereco = historico.top();
			System.out.println(endereco);
		}
	}

}