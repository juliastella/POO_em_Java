/*public class Pessoa {
    public String nome;
    public Integer idade;
}*/
public class Pessoa {
    /*Atributos*/
    private String nome;
    private Integer idade;

    /*Criando um metodo publico Set */
    public void setNome(String nome){
        /*Aqui pode ter validações e outros. */
       this.nome = nome;
    }
    /*Criando um metodo publico Get */
    public String getNome(){
        return this.nome;
    }
    public void setIdade(Integer idade){
        /*Aqui pode ter validações e outros. */
       this.idade = idade;
    }
    /*Criando um metodo publico Get */
    public Integer getIdade(){
        return this.idade;
    }
}

