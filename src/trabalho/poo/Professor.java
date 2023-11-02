package trabalho.poo;

/**
 * Classe Professor que usa a classe Pessoa e adiciona mais variáveis à mesma
 *
 * @author Rafael
 */
public class Professor extends Pessoa {

    /**
     * Construtor para adicionar um novo Professor
     *
     * @param nome Nome do professor que pretende adicionar
     * @param genero Género do professor que está a adicionar
     * @param idade Idade do professor que está a adicionar
     */
    public Professor(String nome, String genero, int idade) {
        super(nome, genero, idade);

    }

    @Override
    public String toString() {
        return "|----------------------------------------|\n"
                + "                  Professor"
                + "\n |Nome = " + getNome()
                + "\n |Genero =" + getGenero()
                + "\n |Idade =" + getIdade()
                + "\n\n";
    }

}
