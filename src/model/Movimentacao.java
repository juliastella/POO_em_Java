package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class Movimentacao {
    // #region Atributos

    private String descricao;
    private Date data;
    private Double valor;
    // #endregion

    // #region AConstrutor

    public Movimentacao(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = new Date();
    }

    // #endregion

    // #region Getts e Settes

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }// Não vai existir o set
     // #endregion

    // #region metodo

    @Override // anotação. Metdo antigo não vale mas nada que é o toString.
    public String toString() {
        // Quero que retorne descrição, data e hora e valor
       String dataFormatada = DataUtil.converterDateParaDataEHora(this.getData());

       return this.getDescricao() + "\n" + dataFormatada +" - R$" + this.valor;
    }

    // #endregion
}
