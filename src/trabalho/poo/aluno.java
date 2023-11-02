package trabalho.poo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Esta classe cria um novo objeto pessoa mas extende esse objeto à classe aluno
 *
 * @author Rafael
 */
public class aluno extends Pessoa implements Serializable {

    private int contador = 0;
    private int numero;
    private String pais;
    private String lingua;
    private String universidade;
    private ArrayList<String> cadeiras_lista;

    /**
     * Construtor que adiciona um novo aluno
     *
     * @param nome Nome do aluno que vai inserir
     * @param genero Género do aluno que vai inserir
     * @param idade Idade do aluno que vai inserir
     * @param pais Pais de origem do aluno que vai inserir
     * @param lingua Lingua que o aluno prefere que seja usada nas cadeiras que
     * se inscrever
     * @param universidade Universidade de origem do aluno inscrito
     */
    public aluno(String nome, String genero, int idade, String pais, String lingua, String universidade) {
        super(nome, genero, idade);
        this.pais = pais;
        this.lingua = lingua;
        this.universidade = universidade;
        contador++;
    }


   
  
    public int getContador() {
        return contador;
    }

    public int getNumero() {
        return numero;
    }


    public String getLingua() {
        return lingua;
    } 
    
    public String getUniversidade() {
        return universidade;
    }
    public ArrayList<String> getCadeiras_lista() {
        return cadeiras_lista;
    }
    
  public void adicionarAluno(String s) {
    cadeiras_lista.add(s);
  }

    public void setCadeiras_lista(ArrayList<String> cadeiras_lista) {
        this.cadeiras_lista = cadeiras_lista;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String país) {
        this.pais = país;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public String toString() {
        return "|----------------------------------------|\n"+
                "                  Aluno"+
                "\n |Nome = "+ getNome() +
                "\n |Genero ="+ getGenero()+
                "\n |Idade ="+ getIdade()+
                "\n |Pais = "+ pais +
                "\n |Lingua = "+ lingua +
                "\n |Universidade = "+ universidade+
                "\n\n";
    }
    
    
    
}
