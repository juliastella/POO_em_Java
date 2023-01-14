public class App{
    public static void main(String[] args) {
        System.out.println("Aprendedo POO");

        /*Instanciando uma Class, que é Pessoa. Construindo um objeto */

        Pessoa pessoa1 = new Pessoa();
        pessoa1.idade = 19;
        pessoa1.nome = "Júlia";

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
    }
}