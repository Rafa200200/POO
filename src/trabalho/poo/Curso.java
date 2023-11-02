
package trabalho.poo;

/**
 * Classe curso, para no futuro podermos adicionar novos cursos ao programa
 *
 * @author Simão
 */
public class Curso {

    private String nomeCurso;

    /**
     * Construtor que nos permite adicionar novos cursos ao programa
     *
     * @param nomeCurso Nome do Curso que pretendemos adicionar
     */
    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public String toString() {
        return "Curso=" + nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
//
//    public int getECTS_curso() {
//        return ECTS_curso;
//    }
//
//    public void setECTS_curso(int ECTS_curso) {
//        this.ECTS_curso = ECTS_curso;
//    }

//    @Override
//    public String toString() {
//        return "Curso" + "Nome Curso=" + nomeCurso + ", ECTS de curso=" + ECTS_curso;
//    }
}
