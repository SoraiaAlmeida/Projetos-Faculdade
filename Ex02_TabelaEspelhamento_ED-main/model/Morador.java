package model;

public class Morador {
    private int numeroApartamento;
    private String nomeMorador;
    private String modeloCarro;
    private String corCarro;
    private String placaCarro;

    // Construtor, getters e setters

    public Morador(int numeroApartamento, String nomeMorador, String modeloCarro, String corCarro, String placaCarro) {
        this.numeroApartamento = numeroApartamento;
        this.nomeMorador = nomeMorador;
        this.modeloCarro = modeloCarro;
        this.corCarro = corCarro;
        this.placaCarro = placaCarro;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public String getNomeMorador() {
        return nomeMorador;
    }

    public void setNomeMorador(String nomeMorador) {
        this.nomeMorador = nomeMorador;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }
}
