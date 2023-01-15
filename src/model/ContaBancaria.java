package src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {
    // #region atributos
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private Date dataAbertura; // Usando o arquivo utils
    private ArrayList<Movimentacao> movimentacoes; // Podem ter varias movimentações, já que um array.
    private Double VALOR_MINIMO_DEPOSITO = 10.0; // Isso é a declaração de uma constante.
    // #endregion

    // #region Construtor
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date(); // vai pegar data e hora do pc e vai usala.

        // Se não instanciar, vai dar uma excpetion de nullPointerException.
        this.movimentacoes = new ArrayList<Movimentacao>();

        // Criando a primeira movimentação
        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);

        // Agora vai salvar a movimentação a cima dentro do array e movimentações.
        // Aqui está iniciando o meu extrato bancario.
        this.movimentacoes.add(movimentacao);
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

    public Date getDataAbertura() {
        return dataAbertura;
    }// Não vai existir, pois a data vai ser no momento em que estiver construindo a
     // mesma.
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

        // Aqui faço uma movimentação no extrato.
        Movimentacao movimentacao = new Movimentacao("Deposito", valor);
        this.movimentacoes.add(movimentacao);
    }

    public Double sacar(Double valor) {
        // Verifica se o valor é maior que o saldo da conta.
        // Se for manda mensagem de saldo insuficiente.
        if (valor > this.saldo) {
            throw new InputMismatchException("O saldo é insuficiente");
        }

        // Aqui removemos o valor de saque do saldo atual.
        this.saldo -= valor;

        // Aqui faço uma movimentação no extrato.
        Movimentacao movimentacao = new Movimentacao("Retirada de valor", valor);
        this.movimentacoes.add(movimentacao);

        // Retorna o valor sacado ao usuario.
        return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino) {
        // Efetua um saque na conta atual
        this.sacar(valor); // encapsulado o metodo sacar, já que transferir usara a mesma fução.
        contaDestino.depositar(valor); // Vai pegar a operação do saque armazenar em contaDestino e aplicar o metodo
    }
    // #endregion

}
