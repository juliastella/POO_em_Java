package src.model;

/**
 * Cliente
 */
public class Cliente extends Pessoa {
    // Atributo
    private Integer idade;

    public Cliente(String nome, String telefone, String cpf, Integer idade) {
        super(nome, telefone, cpf);
        
        this.idade = idade;
    }

    // get e set de idade:
    
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}