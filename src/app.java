package src; // Significar que essa pasta se transformou em um pacote.S

import src.model.ContaBancaria; // Criar automaticamente ao colocar o nome da Class

public class app {
    public static void main(String[] args) {
        System.out.println("Criando banco digital");
        System.out.println();

        // instânciando a Class de conta bancaria
        ContaBancaria conta = new ContaBancaria("001", "2122", 4, 150.0);
        System.out.println("+---------------------------+");
        System.out.println("| Seu saldo atual é: "+conta.getSaldo()+" |");
        System.out.println("+---------------------------+");
        System.out.println();

        conta.depositar(250.0);
        System.out.println("+---------------------------+");
        System.out.println("| Seu saldo atual é: "+conta.getSaldo()+" |");
        System.out.println("+---------------------------+");
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("+---------------------------+");
        System.out.println("| Seu saldo atual é: "+conta.getSaldo()+" |");
        System.out.println("+---------------------------+");
        
    }
}
