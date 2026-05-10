package view;

import java.util.HashSet;
import java.util.Set;

import controller.Gestor;
import model.Alumno;
import model.Asignaturas;
import model.Curso;
import model.Nota;

//todo Opcional: Pulir la salida de texto para que quede mas linda
public class VistaBasica implements Vista {
        @Override
        public Curso ingresarDatos() {
                System.out.println("A continuacion se hardcodearan los datos por fines practicos para esta vista");
                Set<Alumno> listaAlumnos = new HashSet<>();
                // Alumno 1
                Nota[] notasA1 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.MATEMATICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.LENGUAJE),
                                new Nota((float) (Math.random() * 10), Asignaturas.HISTORIA),
                                new Nota((float) (Math.random() * 10), Asignaturas.GEOGRAFIA)
                };
                Alumno a1 = new Alumno("Lucas", "Gomez", 20, 1023456, notasA1);

                // Alumno 2
                Nota[] notasA2 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.CIENCIAS),
                                new Nota((float) (Math.random() * 10), Asignaturas.EDUCACION_FISICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.MUSICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.ARTES)
                };
                Alumno a2 = new Alumno("Sofia", "Perez", 19, 2134567, notasA2);

                // Alumno 3
                Nota[] notasA3 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.MATEMATICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.HISTORIA),
                                new Nota((float) (Math.random() * 10), Asignaturas.CIENCIAS),
                                new Nota((float) (Math.random() * 10), Asignaturas.LENGUAJE)
                };
                Alumno a3 = new Alumno("Mateo", "Rodriguez", 22, 3245678, notasA3);

                // Alumno 4
                Nota[] notasA4 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.GEOGRAFIA),
                                new Nota((float) (Math.random() * 10), Asignaturas.ARTES),
                                new Nota((float) (Math.random() * 10), Asignaturas.EDUCACION_FISICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.MATEMATICA)
                };
                Alumno a4 = new Alumno("Valentina", "Fernandez", 21, 4356789, notasA4);

                // Alumno 5
                Nota[] notasA5 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.LENGUAJE),
                                new Nota((float) (Math.random() * 10), Asignaturas.MUSICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.CIENCIAS),
                                new Nota((float) (Math.random() * 10), Asignaturas.HISTORIA)
                };
                Alumno a5 = new Alumno("Joaquin", "Lopez", 23, 5467890, notasA5);

                // Alumno 6
                Nota[] notasA6 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.EDUCACION_FISICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.MATEMATICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.LENGUAJE),
                                new Nota((float) (Math.random() * 10), Asignaturas.GEOGRAFIA)
                };
                Alumno a6 = new Alumno("Martina", "Diaz", 18, 6578901, notasA6);

                // Alumno 7
                Nota[] notasA7 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.HISTORIA),
                                new Nota((float) (Math.random() * 10), Asignaturas.CIENCIAS),
                                new Nota((float) (Math.random() * 10), Asignaturas.ARTES),
                                new Nota((float) (Math.random() * 10), Asignaturas.MUSICA)
                };
                Alumno a7 = new Alumno("Alejandro", "Martinez", 24, 7689012, notasA7);

                // Alumno 8
                Nota[] notasA8 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.MATEMATICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.GEOGRAFIA),
                                new Nota((float) (Math.random() * 10), Asignaturas.EDUCACION_FISICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.LENGUAJE)
                };
                Alumno a8 = new Alumno("Camila", "Gonzalez", 20, 8790123, notasA8);

                // Alumno 9
                Nota[] notasA9 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.CIENCIAS),
                                new Nota((float) (Math.random() * 10), Asignaturas.HISTORIA),
                                new Nota((float) (Math.random() * 10), Asignaturas.MATEMATICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.ARTES)
                };
                Alumno a9 = new Alumno("Facundo", "Romero", 19, 9801234, notasA9);

                // Alumno 10
                Nota[] notasA10 = {
                                new Nota((float) (Math.random() * 10), Asignaturas.MUSICA),
                                new Nota((float) (Math.random() * 10), Asignaturas.LENGUAJE),
                                new Nota((float) (Math.random() * 10), Asignaturas.GEOGRAFIA),
                                new Nota((float) (Math.random() * 10), Asignaturas.EDUCACION_FISICA)
                };
                Alumno a10 = new Alumno("Lucia", "Sosa", 21, 1092345, notasA10);
                listaAlumnos.add(a1);
                listaAlumnos.add(a2);
                listaAlumnos.add(a3);
                listaAlumnos.add(a4);
                listaAlumnos.add(a5);
                listaAlumnos.add(a6);
                listaAlumnos.add(a7);
                listaAlumnos.add(a8);
                listaAlumnos.add(a9);
                listaAlumnos.add(a10);

                Curso miCurso = new Curso("ALUMNOS-JAVA-2026", listaAlumnos);

                System.out.println("Datos hardcodeados exitosamente");
                return miCurso;

        }

        @Override
        public void mostrarDatos(Curso curso) {
                System.out.println("A continuacion se mostraran los datos del curso elegido: /n/n");
                Gestor.calcularPromediosPorCurso(curso).forEach((alumno, promedio) -> {
                        System.out.println("El siguiente alumno: \n\n" + alumno + "\n\n Tiene un promedio de :"
                                        + promedio);
                });
        }
}
