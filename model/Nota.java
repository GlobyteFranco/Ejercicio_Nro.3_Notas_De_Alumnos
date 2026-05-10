package model;

class Nota {
    private float valor;
    private Asignaturas asignatura;

    public Nota(float valor, Asignaturas asignatura) {
        this.valor = valor;
        this.asignatura = asignatura;
    }

    public float getValor() {
        return valor;
    }

    public Asignaturas getAsignatura() {
        return asignatura;

    }

    @Override
    public String toString() {
        return "Nota [valor=" + valor + ", asignatura=" + asignatura + "]";
    }

}