package src.model;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        // Aqui por baixo ele cria uma conta bancaria.
        super(agencia, conta, digito, saldoInicial);
        
    }

}