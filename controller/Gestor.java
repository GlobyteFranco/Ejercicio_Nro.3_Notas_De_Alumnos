package controller;

import java.util.HashMap;
import java.util.Map;

import model.Alumno;
import model.Curso;
import model.Nota;

public abstract class Gestor {
    public static Map<Alumno, Float> calcularPromediosPorCurso(Curso curso) {
        Map<Alumno, Float> promediosAlumnos = new HashMap<>();
        for (Alumno alumno : curso.getAlumnos()) {
            float promedio = 0;
            for (Nota nota : alumno.getNotas()) {
                promedio += nota.getValor();
            }
            promedio = promedio / 4;

            promediosAlumnos.put(alumno, promedio);
        }

        return promediosAlumnos;
    }
}
