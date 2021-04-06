package rafael.guimaraes.recyclerview.activity.activity.model;

public class Cursos {

    private String cursoCursos;
    private String valorCursos;
    private String tempoCursos;
    private String professorCursos;
    private int imageCurso;


    public Cursos(){
    }

    public Cursos(String cursoCursos, String valorCursos, String tempoCursos, String professorCursos, int imageCurso) {
        this.cursoCursos = cursoCursos;
        this.valorCursos = valorCursos;
        this.tempoCursos = tempoCursos;
        this.professorCursos = professorCursos;
        this.imageCurso = imageCurso;
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

    public int getImageCurso() {
        return imageCurso;
    }

    public void setImageCurso(int imageCurso) {
        this.imageCurso = imageCurso;
    }
}
