package trabalho.poo;

/**
 * Classe pessoa, que vai ser usada futuramente como base para a classe "Aluno"
 * e para a classe "Professor"
 *
 * @author Simão
 */
public class Pessoa {

    private String nome;
    private String genero;
    private int idade;

    /**
     * Construtor que adiciona uma nova pessoa
     *
     * @param nome Nome da pessoa que vai ser inserida no programa
     * @param genero Género da pessoa que vai ser inserida
     * @param idade Idade da pessoa que está a inserir
     */
    public Pessoa(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
