package View;

import javax.swing.JOptionPane;

import br.com.leandrocolevati.pilhastrings.Pilha;
import Controller.HistoricoController;

public class Principal {

	public static void main(String[] args) throws Exception {
		Pilha historico = new Pilha();
		HistoricoController h = new HistoricoController();
			
		int opc = 0;
		String endereco = "";

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"Historico Web \n1-Inserir novo endereco \n2-Remover ultimo endereco \n3-Consultar ultimo endereco \n9-Finalizar"));
			switch (opc) {
			case 1: {
				endereco = JOptionPane.showInputDialog("Digite o endereco");
				h.inserir(endereco, historico);
			}
				break;
			case 2: {
				h.remover(historico);
			}
				break;
			case 3: {
				h.consultar(historico);
			}
				break;
			case 9: {
				System.out.println("Historico finalizado");
			}
				break;
			default:
				System.out.println("Opcao invalida");
			}
		}
	}

}