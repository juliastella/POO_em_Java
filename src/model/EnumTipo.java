package src.model;

public enum EnumTipo {

    // E preiso definir as opicoes de terao dentro do numerador;
    BASICO("Basico"), 
    MASTER("Master"), 
    PRESIDENCIAL("Suite Presidencial");

    
    private String valor; // O valor e o que vai estar dentro da constante de cima, que esta entre parenteses.

    // Criacao do construtor privado:
     
     private EnumTipo(String valor){ // esse construtor vai se responsavel por cada constante que contem valor.
        this.valor = valor;
     }
  

    // metodo 

    public String getValor(){
        return valor;
    }
}
