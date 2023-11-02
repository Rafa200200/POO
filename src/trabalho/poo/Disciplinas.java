
package trabalho.poo;

/**
 * Classe Disciplina que extende a classe Curso, de movo a inserirmos
 * Disciplinas dentro de cada curso
 *
 * @author Fábio
 */
public class Disciplinas extends Curso {

    private String nome;
    private String linguaAula;
    private int ECTS;
    private final Professor professor;

    /**
     * Construtor que nos permite adicionar uma disciplina e especificar a qual
     * curso pertence e os seus detalhes
     *
     * @param nomeCurso Nome do curso a que esta disciplina pertence
     * @param nome Nome da disciplina que vai ser adicionada
     * @param professor Nome do professor da disciplina
     * @param linguaAula Idioma que vai ser falado nas aulas desta disciplina
     * @param ECTS Número de créditos associados a esta disciplina
     */
    public Disciplinas(String nomeCurso, String nome, Professor professor, String linguaAula, int ECTS) {
        super(nomeCurso);
        this.nome = nome;
        this.linguaAula = linguaAula;
        this.ECTS = ECTS;
        this.professor = professor;

    }

    public String getProfessorNome() {
        return professor.getNome();
    }

    public String getNome() {
        return nome;
    }

    public String getLinguaAula() {
        return linguaAula;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLinguaAula(String linguaAula) {
        this.linguaAula = linguaAula;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

//    public String getNomeCurso() {
//        return super.getNomeCurso();
//    }
//
//    public void setNomeCurso(String nomeCurso) {
//        Disciplinas.nomeCurso = super.getNomeCurso();
//    }
//    
    @Override
    public String toString() {
        return "Disciplina:" + "\n Curso=" + getNomeCurso() + "\n Nome=" + getNome() + "\n Professor=" + getProfessorNome() + "\n LINGUA=" + getLinguaAula() + "\n ECTS=" + getECTS();
    }

}
