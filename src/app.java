package src; // Significar que essa pasta se transformou em um pacote.S

// Criar automaticamente ao colocar o nome da Class

import src.model.ContaCorrente;
import src.model.ContaPoupanca;
import src.utils.DataUtil;

public class app {
    public static void main(String[] args) {
        System.out.println("Criando banco digital");
        System.out.println();

        // instânciando a Class de conta bancaria
        ContaCorrente conta = new ContaCorrente("001", "2122", 4, 150.0);
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| Abertura da corrente conta em: " + conta.getDataAbertura() + " |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println();

        System.out.println("+---------------------------+");
        System.out.println("| Seu saldo atual é: " + conta.getSaldo() + " |");
        System.out.println("+---------------------------+");
        System.out.println();

        conta.depositar(250.0);
        System.out.println("+---------------------------+");
        System.out.println("| Seu saldo atual é: " + conta.getSaldo() + " |");
        System.out.println("+---------------------------+");
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("+---------------------------+");
        System.out.println("| Seu saldo atual é: " + conta.getSaldo() + " |");
        System.out.println("+---------------------------+");
        System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("002", "4123", 5, 200.0);
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("| Abertura da poupança conta2 em: " + conta2.getDataAbertura() + " |");
        System.out.println("+--------------------------------------------------------------+");
        System.out.println();

        conta2.transferir(50.0, conta);
        System.out.println("+--------------------------------------+");
        System.out.println("| Saldo conta poupaça de destino: " + conta2.getSaldo() + " |");
        System.out.println("+--------------------------------------+");
        System.out.println();

        System.out.println("+--------------------------------------------+");
        System.out.println("| Seu saldo da conta corrente atual é: " + conta.getSaldo() + " |");
        System.out.println("+--------------------------------------------+");
        System.out.println();

        // #region Data e hora
        //DataUtil util = new DataUtil(); instanciando a class
    
        //Sem precisar instanciar.
        var formatado = DataUtil.converterDateParaDataEHora(conta2.getDataAbertura());
        var formatado1 = DataUtil.converterDateParaData(conta2.getDataAbertura());
        var formatado2 = DataUtil.converterDateParaHora(conta2.getDataAbertura());
        System.out.println(formatado);
        System.out.println(formatado1);
        System.out.println(formatado2);
        // #endregion

    }
}
