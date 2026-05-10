package model;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private int legajo;
    private Nota[] notas;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getLegajo() {
        return legajo;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public Alumno(String nombre, String apellido, int edad, int legajo, Nota[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.legajo = legajo;
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", Legajo=" + legajo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (legajo != other.legajo)
            return false;
        return true;
    }

}
