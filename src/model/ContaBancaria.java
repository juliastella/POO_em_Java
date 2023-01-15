package src.model;

import java.util.InputMismatchException;

public class ContaBancaria {
    // #region atributos
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private Double VALOR_MINIMO_DEPOSITO = 10.0; // Isso é a declaração de uma constante.
    // #endregion

    // #region Construtor
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }
    // #endregion

    // #region Set e Get
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }// Não vai existi um set para saldo, pois saldo não vai ser alterado

    // #endregion

    // #region Metodos
    public void depositar(Double valor) { // adicionar valor a saldo.

        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor minimo de deposito é R$" + VALOR_MINIMO_DEPOSITO); // Isso é uma
                                                                                                         // exceção
                                                                                                         // personalizado,
                                                                                                         // é usada
                                                                                                         // quando não é
                                                                                                         // atendida uma
            // validação.
        }
        // Se o valor é maior que dez, então this.saldo adiciona.
        this.saldo += valor;

    }

    public Double sacar(Double valor) {
       // Verifica se o valor é maior que o saldo da conta.
       // Se for manda mensagem de saldo insuficiente.
       if(valor > this.saldo){
         throw new InputMismatchException("O saldo é insuficiente");
       }
       
       // Aqui removemos o valor de saque do saldo atual.
       this.saldo -= valor;
       // Retorna o valor sacado ao usuario.
       return valor;
    }
    // #endregion

}
