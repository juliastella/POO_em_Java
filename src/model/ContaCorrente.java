package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        // Aqui por baixo ele cria uma conta bancaria.
        super(agencia, conta, digito, saldoInicial);
        
    }

    
    @Override // Uma sobre escrita do metodo.
    public void imprimirExtrato() {

        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|              Extrato contacorrente                          |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println();


        System.out.println("Gerando em : " + DataUtil.converterDateParaDataEHora(new Date()));
        System.out.println();

        for (Movimentacao movimentacao : this.movimentacoes) { // DOis pontos significa dentro
            System.out.println(movimentacao);
            System.out.println();
        }
        System.out.println();
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                   finalização extrato                       |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println();
    }

}
