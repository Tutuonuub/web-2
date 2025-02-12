import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private List<Disciplina> disciplina;

    public Curso(){
        this("", new ArrayList<Disciplina>());
    }
    
    public Curso(String nomeCurso){
        this(nomeCurso, new ArrayList<Disciplina>());
    }

    public Curso(String nomeCurso, List<Disciplina> disciplinas){
        this.nomeCurso = nomeCurso;
        this.disciplina = disciplinas;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public void addDiciplina(Disciplina disciplina){
        this.disciplina.add(disciplina);
    }

    public int horasTotaisCurso(){
        int horasTotais = 0;
        for (Disciplina n : this.disciplina) {
            horasTotais += n.getCargaHoraria();
        }
        return horasTotais;
    }
}
