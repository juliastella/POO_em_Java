package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String agencia, String conta, Integer digito, Double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                    Extrato poupaça                          |");
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
