package clases;

import java.util.ArrayList;

public class Asignatura {

    private int codigo;
    private String nombre;
    private Alumno alumno;
    private Profesor profesor;

    private ArrayList<Alumno> alumnos;

    public Asignatura(int codigo, String nombre, Alumno alumno, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.alumno = alumno;
        this.profesor = profesor;
    }

    public Asignatura(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
