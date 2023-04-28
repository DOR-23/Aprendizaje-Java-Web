import java.util.ArrayList;

public class Boletin {
    private String alumno;
    private double nota;
    private String calificacion;
    private ArrayList<String> materias;

    public Boletin(String alumno, double nota, String calificacion, ArrayList<String> materias) {
        this.alumno = alumno;
        this.nota = nota;
        this.calificacion = calificacion;
        this.materias = materias;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<String> materias) {
        this.materias = materias;
    }


}
