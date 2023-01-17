package src.model;

import src.interfaces.ComportamentoCamarira;
import src.interfaces.ComportamentoRecepicionista;

public class Gerente extends Pessoa implements ComportamentoCamarira, ComportamentoRecepicionista {

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        // TODO Auto-generated constructor stub
    }

    // #region interfaces de outras implementacoes.
    // Impementacao atendente.
    @Override
    public void atendeOTelefone() {
        System.out.println("Sou qualificada para o atedimento geral e especifico.");
        System.out.println();

    }

    @Override
    public void falaIngles() {
        System.out.println("Sou fluente na lingua inglêsa.");
        System.out.println();

    }
    // Impementacao camareira.
    @Override
    public void arrumaACama() {
        System.out.println("Sou qualificada para auxiliar na atividade.");
        System.out.println();

    }

    @Override
    public void limparQuarto() {
        System.out.println("Sou qualificada para auxiliar na atividade de limpeza.");
        System.out.println();

    }
    // #endregion
}
