package src;

import java.util.ArrayList;
import java.util.List;

import src.model.Camareira;
import src.model.Cliente;
import src.model.EnumTipo;
import src.model.Gerente;
import src.model.Quarto;
import src.model.Recepionista;

public class app2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hotel java");
        System.out.println();

        Cliente cliente1 = new Cliente("Amelia", "(81) 99999-9999", "112.232.466.09", 18);

        // #region interfaces
        /*
         * Recepionista recepicionista1 = new Recepionista("Jaqueline",
         * "(81) 99999-9987", "222.232.566.09");
         * 
         * recepicionista1.atendeOTelefone();
         * recepicionista1.falaIngles();
         * 
         * Camareira camareira1 = new Camareira("Catarina", "(81) 99349-9999",
         * "912.982.466.09");
         * 
         * camareira1.arrumaACama();
         * camareira1.limparQuarto();
         * 
         * Gerente gerente1 = new Gerente("Ana", "(81) 92335-9999", "900.982.555.09");
         * 
         * gerente1.arrumaACama();
         * gerente1.limparQuarto();
         * gerente1.atendeOTelefone();
         * gerente1.falaIngles();
         */
        // #endregion

        // #region Enums
        /*
         * Quarto quarto1 = new Quarto();
         * quarto1.setNumeroQuarto("30A");
         * quarto1.setValor(300.0);
         * quarto1.setTipo(EnumTipo.MASTER); // chamando o enum
         * 
         * Quarto quarto2 = new Quarto();
         * quarto2.setNumeroQuarto("30A");
         * quarto2.setValor(300.0);
         * quarto2.setTipo(EnumTipo.PRESIDENCIAL); // chamando o enum
         * 
         * System.out.println(quarto2.getTipo());
         * System.out.println(quarto2.getTipo().getValor());
         */
        // #endregion

        // #region Stream
        Cliente cliente2 = new Cliente("Joca Firmino", "(81) 99999-8888", "112.232.333.10", 19);
        Cliente cliente3 = new Cliente("Junior Rodrigues", "(81) 99999-4444", "115.222.111.09", 24);
        Cliente cliente4 = new Cliente("Simone Caz", "(81) 99999-7777", "113.232.346.12", 30);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        // retorna a quantidade de elementos presente em uma stream
        clientes.stream().count();
        clientes.size(); // faz a mesma cois do que esta acima.

        clientes.stream().limit(2); // retorna uma nova lista com apenas dois elementos.
        clientes.stream()
        .limit(2)
        .forEach(c -> System.out.println(c.getNome())); // vai printar usando a regra somente os nomes.
        
        //Testar essa parte
        /*var resultado1 = clientes.stream().limit(2);
        List<Cliente> resultado1 = (List<Cliente>);*/

        clientes.stream().skip(2); // o skip serve para pular linha.
        clientes.stream().sorted(); // Vai ordena pela ordem padrao dos elementos.
        
        //clientes.stream().sorted(comparing(Cliente::getIdade));

        clientes.stream().filter(c -> c.getIdade() > 25)
        .forEach(c -> System.out.println(c.getNome())); // pega todos os componentes da lista, comparando todos. E todos maiores de 25 vao ser impressos. E vai imprimir por nome.
   
        // Pessoa com o sobrenome.
        clientes.stream().filter(c -> c.getNome().contains("Caz")) // Vai verificar se existe algum cliente com esse nome.
        .forEach(c -> System.out.println(c.getNome()));

        // Primeira letra do nome.
        clientes.stream().filter(c -> c.getNome().startsWith("J")) // Vai verificar se existe algum cliente com esse nome.
        .forEach(c -> System.out.println(c.getNome()));

        // vai pegar os nomes
        clientes.stream().map(c -> c.getNome()); // para cada cliente que esta aqui dentro, irei pegar o nome.
        clientes.stream().map(Cliente::getNome); // Isso e a mesma coisa da linha a cima.

        // #endregion
    }
}
