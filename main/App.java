package main;

import view.Vista;
import view.VistaBasica;

public class App {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        Vista vista = new VistaBasica();
        vista.mostrarDatos(vista.ingresarDatos());
    }
}