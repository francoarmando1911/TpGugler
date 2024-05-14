package clases;

import clases.Alumno;
import java.util.ArrayList;

public class Curso {
    private int cupo;
    private ArrayList<Alumno> alumnos;

    public Curso(int cupo) {
        this.cupo = cupo;
        this.alumnos = new ArrayList<>();
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumnos.size() < cupo) {
            alumnos.add(alumno);
            System.out.println("Alumno agregado al curso.");
        } else {
            System.out.println("No se puede agregar más alumnos, el cupo está lleno.");
        }
    }

    public void eliminarAlumno(Alumno alumno) {
        alumnos.remove(alumno);
        System.out.println("Alumno eliminado del curso.");
    }
}