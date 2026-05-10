package model;

import java.util.Set;

public class Curso {
    private String codigo;
    private Set<Alumno> alumnos;

    public Curso(String codigo, Set<Alumno> alumnos) {
        this.codigo = codigo;
        this.alumnos = alumnos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAumno(Alumno alumno) {
        this.alumnos.add(alumno);

    }

}