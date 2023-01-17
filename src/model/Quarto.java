package src.model;

public class Quarto {
    // #region atributos
    private String numeroQuarto;
    private Double valor;
    private EnumTipo tipo; // Vai ser enumTipo
    // #endregion

    // #region construtor
    // #endregion

    // #region set e get
    public String getNumeroQuarto() {
        return numeroQuarto;
    }
    public void setNumeroQuarto(String numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public EnumTipo getTipo() { // muda o tipo no get e set.
        return tipo;
    }
    public void setTipo(EnumTipo tipo) {
        this.tipo = tipo;
    }

    // #endregion

}
