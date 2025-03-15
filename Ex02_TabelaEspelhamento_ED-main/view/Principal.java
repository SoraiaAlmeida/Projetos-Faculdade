package view;

import br.edu.fateczl.lista.listaObj.Lista;
import controller.TabelaEspalhamento;
import model.Morador;

public class Principal {
    public static void main(String[] args) throws Exception {
        TabelaEspalhamento tabelaEspalhamento = new TabelaEspalhamento(10);
        
        // Cadastrando moradores
        Morador morador1 = new Morador(101, "Soraia", "Jeep", "Verde", "ABC-1234");
        tabelaEspalhamento.cadastrarMorador(morador1);
        
        Morador morador2 = new Morador(202, "Larissa", "Volkswagen", "Veermelho", "DEF-5678");
        tabelaEspalhamento.cadastrarMorador(morador2);
        
        Morador morador3 = new Morador(701, "Sheila", "Chevrolet", "Azul", "GHI-9012");
        tabelaEspalhamento.cadastrarMorador(morador3);
        
        // Consultando morador
        int numeroApartamento = 202;
        Morador moradorConsultado = tabelaEspalhamento.consultarMorador(numeroApartamento);
        if (moradorConsultado != null) {
            System.out.println("Morador encontrado:");
            System.out.println("Número do apartamento: " + moradorConsultado.getNumeroApartamento());
            System.out.println("Nome do morador: " + moradorConsultado.getNomeMorador());
            System.out.println("Modelo do carro: " + moradorConsultado.getModeloCarro());
            System.out.println("Cor do carro: " + moradorConsultado.getCorCarro());
            System.out.println("Placa do carro: " + moradorConsultado.getPlacaCarro());
        } else {
            System.out.println("Morador não encontrado.");
        }
        
        // Excluindo morador
        int numeroApartamentoExcluir = 202;
        tabelaEspalhamento.excluirMorador(numeroApartamentoExcluir);
        
        // Listando moradores de um determinado andar
        int andar = 1;
        Lista moradoresAndar = tabelaEspalhamento.listarMoradoresPorAndar(andar);
        int tamanho = moradoresAndar.size();
        if (tamanho > 0) {
            System.out.println("Moradores do andar " + andar + ":");
            for (int i = 0; i < tamanho; i++) {
                Morador morador = (Morador) moradoresAndar.get(i);
                System.out.println("Número do apartamento: " + morador.getNumeroApartamento());
                System.out.println("Nome do morador: " + morador.getNomeMorador());
                System.out.println("Modelo do carro: " + morador.getModeloCarro());
                System.out.println("Cor do carro: " + morador.getCorCarro());
                System.out.println("Placa do carro: " + morador.getPlacaCarro());
                System.out.println("-----------");
            }
        } else {
            System.out.println("Não há moradores no andar " + andar);
        }
    }
}
