package controller;

import br.edu.fateczl.lista.listaObj.Lista;
import model.Morador;

public class TabelaEspalhamento {
    private Lista[] tabela;
    private int capacidade;

    public TabelaEspalhamento(int capacidade) {
        this.capacidade = capacidade;
        this.tabela = new Lista[capacidade];
        for (int i = 0; i < capacidade; i++) {
            tabela[i] = new Lista();
        }
    }

    private int calcularHash(int numeroApartamento) {
        return numeroApartamento % capacidade;
    }

    public void cadastrarMorador(Morador morador) throws Exception {
        int indice = calcularHash(morador.getNumeroApartamento());
        tabela[indice].add(morador, tabela[indice].size());
    }

    public void excluirMorador(int numeroApartamento) throws Exception {
        int indice = calcularHash(numeroApartamento);
        Lista lista = tabela[indice];
        int tamanho = lista.size();
        for (int i = 0; i < tamanho; i++) {
            Morador morador = (Morador) lista.get(i);
            if (morador.getNumeroApartamento() == numeroApartamento) {
                lista.remove(i);
                break;
            }
        }
    }

    public Morador consultarMorador(int numeroApartamento) throws Exception {
        int indice = calcularHash(numeroApartamento);
        Lista lista = tabela[indice];
        int tamanho = lista.size();
        for (int i = 0; i < tamanho; i++) {
            Morador morador = (Morador) lista.get(i);
            if (morador.getNumeroApartamento() == numeroApartamento) {
                return morador;
            }
        }
        return null;
    }

    public Lista listarMoradoresPorAndar(int andar) throws Exception {
        Lista moradoresAndar = new Lista();
        for (int i = 0; i < capacidade; i++) {
            Lista lista = tabela[i];
            int tamanho = lista.size();
            for (int j = 0; j < tamanho; j++) {
                Morador morador = (Morador) lista.get(j);
                int numeroApartamento = morador.getNumeroApartamento();
                int andarMorador = numeroApartamento / 100;
                if (andarMorador == andar) {
                    moradoresAndar.add(morador, moradoresAndar.size());
                }
            }
        }
        return moradoresAndar;
    }
}
