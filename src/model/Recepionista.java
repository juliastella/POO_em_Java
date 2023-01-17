package src.model;

import src.interfaces.ComportamentoRecepicionista;

public class Recepionista extends Pessoa implements ComportamentoRecepicionista{
    
    public Recepionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        //TODO Auto-generated constructor stub
    }
    
    //#region implementações
    @Override
    public void atendeOTelefone() {
        System.out.println("Sou qualificada para o atedimento.");
        System.out.println();
        
    }

    @Override
    public void falaIngles() {
        System.out.println("Sou qualificada para uso da lingua inglêsa.");
        System.out.println();
        
    }
    //#endregion
}
