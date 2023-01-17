package src.model;

import src.interfaces.ComportamentoCamarira;

public class Camareira extends Pessoa implements ComportamentoCamarira{

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        //TODO Auto-generated constructor stub
    }
    //#region implementações
    @Override
    public void arrumaACama() {
        System.out.println("Sou qualificada para a vaga.");
        System.out.println();
        
    }

    @Override
    public void limparQuarto() {
        System.out.println("Estou ciente das minhas atividades.");
        System.out.println();
    }
    //#endregion
}
