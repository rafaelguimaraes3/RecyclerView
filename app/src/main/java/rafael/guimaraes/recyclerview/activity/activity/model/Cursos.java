package rafael.guimaraes.recyclerview.activity.activity.model;

public class Cursos {

    private String cursoCursos;
    private String valorCursos;
    private String tempoCursos;
    private String professorCursos;


    public Cursos(){


    }

    public Cursos(String cursoCursos, String valorCursos, String tempoCursos, String professorCursos) {
        this.cursoCursos = cursoCursos;
        this.valorCursos = valorCursos;
        this.tempoCursos = tempoCursos;
        this.professorCursos = professorCursos;
    }

    public String getCursoCursos() {
        return cursoCursos;
    }

    public void setCursoCursos(String cursoCursos) {
        this.cursoCursos = cursoCursos;
    }

    public String getValorCursos() {
        return valorCursos;
    }

    public void setValorCursos(String valorCursos) {
        this.valorCursos = valorCursos;
    }

    public String getTempoCursos() {
        return tempoCursos;
    }

    public void setTempoCursos(String tempoCursos) {
        this.tempoCursos = tempoCursos;
    }

    public String getProfessorCursos() {
        return professorCursos;
    }

    public void setProfessorCursos(String professorCursos) {
        this.professorCursos = professorCursos;
    }
}
